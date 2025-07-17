import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable implements Comparable<comparable>{
    // why is this comparable and not T
    /*because we're specifying what type this class can be compared to or with
     * when we say this
     * public interface Comparable<T> {
            int compareTo(T other);
        }
            it means
            any class that implements Comparable must define how to compare itself with 
            a type and maybe that type is T ok
            and therefore it should be of the same type as class
            Does Comparable<T> mean you must compare objects of the same class?
Not necessarily, but let’s break it into two ideas:
by convention we do compare of same class but we can do
class Student implements Comparable<Object>
public int compareTo(Object other) {
    // You’ll need to cast it to something:
    Student s = (Student) other;
    return this.marks - s.marks;
}

     */
    /*
     * comparable is an interface in java used
     * to define a natural ordereding for objects of 
     * a class
     * if a class implements comparable it means 
     * objects can be compared to one and another
     * it's defined as
     * public interface Comparable<T>{
     *  int compareTo(T other);
     * }
     * has only 1 method
     * this method compares 'this' object with 'other' objects and returns
     * 0 : if equal
     * <0: if this<other
     * >0: if this>other
     * eg given below
     */
    String name;
    int marks;
    comparable(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(comparable other){
        return this.marks - other.marks;
    }
    public String toString(){
        return name + ": " + marks;
    }
    public static void main(String[] args) {
        List<comparable> list = new ArrayList<>();
        list.add(new comparable("sam", 60));
        System.out.println(list);
        list.add(new comparable("lia", 78));
        System.out.println(list);
        list.add(new comparable("ppp", 43));
        System.out.println(list);
        Collections.sort(list);
        // collection utility class in javathat provides static methods
        // for working with collections like lists srts etc
        System.out.println(list);
        comparable c1 = new comparable("okbro", 80);
        comparable c2 = new comparable("whaty", 55);
        comparable c3 = new comparable("poppy", 94);
        System.out.println("c1 is less 80 and c3 is more 94");
        System.out.println(c1.compareTo(c3));
        System.out.println("c1 is more 80 and c2 is less 55");
        System.out.println(c1.compareTo(c2));
        System.out.println("c1 equal to c1 duh");
        System.out.println(c1.compareTo(c1));
    }
}
