//import java.util.ArrayList;
import java.util.*;
public class CustomGenArrayList<T>{
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
    public CustomGenArrayList(){
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
        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        list3.add(45);
        System.out.println(list3);
        //list3.add("yaay");
        // got an error since we made list3 as of integer type
        //System.out.println(list3);
        for(int i=1; i<25; i++){
            list3.add(2*i);
        }
        System.out.println(list3);
    }
}
