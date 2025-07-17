add lambda function examples and consumer interface
import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdafunct {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<5; i++){
                arr.add(i+1);
            }
            arr.forEach((item) -> System.out.println(item*2));
            Consumer<Integer> fun = (item) -> System.out.println(item*2);
            arr.forEach(fun);
            Oper sum = (a, b) -> a+b;
            System.out.println(sum);
            Oper prod = (a,b) -> a*b;
            System.out.println(a, b);
    }
}
/*
 * lambda fundtion are basically in line or 
 * one line functions
 * most of the time u dont need the name of the function
 * can be stored in variables too
 * lambda functions are basically arrow functions in js
 * (parameter) -> expression
 * (int x, int y) -> x*y;
 * 
 * 
 * consumer in java is a functional interface
 * it represents a function that takes one input and returns nothing
 */
interface Oper{
    int val(int a, int b);
}
