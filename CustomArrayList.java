//import java.util.ArrayList;
import java.util.*;
public class CustomArrayList{
    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size=0; // also working as index value
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    // add method
    public void add(int num){
        if(this.isfull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isfull(){
        // size = length of array
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
        // decreases size and if new item added override it
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int value){
        data[index] = value;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // overriding
        return "CustomArrayList{" +
       "data=" + Arrays.toString(data) +
       ", size="+ size +
       "}";
    }
    // 
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        System.out.println("added 3");
        System.out.println(list);
        list.add(5);
        System.out.println("added 5");
        System.out.println(list);
        list.add(9);
        System.out.println("added 9");
        System.out.println(list);
        list.add(4);
        System.out.println("added 4");
        System.out.println(list);
        list.add(9);
        System.out.println("added 9");
        System.out.println(list);
        list.remove();
        System.out.println("removed, what?");
        System.out.println(list);
        list.get(2);
        System.out.println("get number at index 2!");
        System.out.println(list);
        list.set(2, 4);
        System.out.println("set new value of index 2");
        System.out.println(list);
        list.toString();
        System.out.println("tostring lets test it out");
        System.out.println(list);
        System.out.println("final");
        System.out.println(list);
        for(int i=0; i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        // note
        // as u did
        // ArrayList<Integer> only classes can be added not primitives!!!
        // u can't do ArrayList<int>
        list2.add("adfg");
        /*omArrayList.java && java CustomArrayList
CustomArrayList.java:86: error: incompatible types: String cannot be converted to Integer
        list2.add("adfg");
                  ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
 */
        // above thing giving us error??!
        // it makes sure we can only eneter integer
        // this functionality is called generics
        // generics help us to provide a type 
        // providing a type can be called as parameterised type

    }
}
/*
 * problem?
 * by default it is an integer array
 * arraylist what we're storing is only integers
 * but arraylist can have any type of datatype
 * strings, int, boolean float 
 * but this is not allowing us
 * internal array lsit provide us functionality
 * copy pasting code for each type : tiring
 * resusibilty
 * type safety
 * if ive a list and then anyone can add string number etc
 * but what if its allowed only to number???
 */