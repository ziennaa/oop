//import java.util.ArrayList;
import java.util.*;
public class wildcardstwo<T extends Number>{
    /*
     * in generics ? symbol : called : wildcards
     * means? idk the exact type but ik it extends or is related to something
     * ? extends number
     * public void printList(List<? extends Number> list)
     * difference between T and ? then??
     * You're defining T, so the compiler knows exactly what T is when the method is called.
     * Basically T IS FOR READING AND WRITING, WE'RE DEFINING HERE
     * ANDD ? IS ONLY FOR READING NOT WRITING, CUZ DEFINATION PART IS DONE IN T
     * SO MOST OF THE TIME WHEN WERE PASSING OR INPUTTING WE USE ?
     * ALDSOO ? super T
     */
    // provided a type over here
    private Object[] data;
    // instead of making it like
    /*
     * private T[] data;
     * we're going to make it as object class  Object type
     * cuz even arraylist is also using Object
     * Object is the class inherited by all the other classes
     */
    private int DEFAULT_SIZE=10;
    private int size=0; // also working as index value
    public wildcardstwo(){
        this.data = new Object[DEFAULT_SIZE];
        // above giving an error
        // type parameter T cannot be instantiated directly
        // if this was allowed 
        // bytecode is not gonna know what t or even the value of it
        // so what obj to create for this
        // therefore we got the error
        // we're gonna use the object class\\
        // since object is the superior
    }
    // add method
    public void add(T num){
        if(this.isfull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isfull(){
        // size = length of array
        return size == data.length;
    }
    public void getList(List<? extends Number> list){
        // do something
        // here u can only pass numebr type u cannot pass subclasses here List<Number> 
        // but if u wanna pass subclasses as well do this List<? extends Number> 

    }
    private void resize(){
        Object[] temp = new Object[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        T removed = (T)data[--size];
        return removed;
        // decreases size and if new item added override it
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index, T value){
        data[index] = value;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // overriding
        return "CustomGenArrayList{" +
       "data=" + Arrays.toString(data) +
       ", size="+ size +
       "}";
    }
    // 
    public static void main(String[] args) {
        wildcards<Number> list3 = new wildcards<>();
        list3.add(45);
        System.out.println(list3);
        //list3.add("yaay");
        // got an error since we made list3 as of integer type
        //System.out.println(list3);
        list3.add(56.78);
        System.out.println(list3);
        /*
         * cs\src\" && javac wildcards.java && java wildcards
wildcards.java:72: error: incompatible types: double cannot be converted to Integer
        list3.add(56.78);
                  ^
Note: wildcards.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

error??!!!

even though class defined as number
here we're specially creating a list of integers
which means u can only pass integer objects
if u wanna make it work either do this
wildcards<Double> list3 = new wildcards<>();
list3.add(56.78);  //  works now

or use this
wildcards<Number> list = new wildcards<>();
list.add(56);      // Integer — allowed
list.add(56.78);   // Double — allowed
list.add(5.4f);    // Float — allowed


now works
         */
    }
}
/*
 * wildcards to restric what type of items i can provide
 */

/*
 * number is a class that uses
 * integer
 * float 
 * double 
 * etc
 * 
 */