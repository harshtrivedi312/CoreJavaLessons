package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class javaLambda {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        //using lambda expression to iterate over the list.

        //in this example we are using lambda expression to itterate
        //over the list and print each fruit in the list...
        fruits.forEach(fruit -> System.out.println(fruit));

        // using lambda expression with multiple statements
        //this demonstrates the use of multiple statements in a lambda expression
        //it converts each fruit to upper case and print it.
        System.out.println("Fruit name in upper case");
        fruits.forEach(fruit -> {
            String modifiedFruit = fruit.toUpperCase();
            System.out.println(modifiedFruit);
        });

        //Using lambda expression with method reference
        //we will use a method reference from SOUT to achieve print.
        fruits.forEach(System.out::println);


        //lambda expressions are a concise way to write code that can be used
        //as an implementation of functional interfaces.
        //lambda provide a way to write inline, anonymous functions, making the code
        // more readable and expressive.


    }

}
