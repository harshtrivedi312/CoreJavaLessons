package javaBasics;

public class Polymorphism {

    public static void main(String[] args) {
//        javaBasics.Animal2 animals = new javaBasics.Animal2();
//        javaBasics.Animal2 animal1 = new javaBasics.Dog2();
//        javaBasics.Animal2 animal2 = new javaBasics.cat2();
//
//        animal2.makeSound();
//        animal1.makeSound();
//        animals.makeSound();
//
//        javaBasics.Shape shape = new javaBasics.Shape();
//        System.out.println("Area of javaBasics.Shape" + shape.calculateArea());
//
//        javaBasics.Rectangle rectangel = new javaBasics.Rectangle(6,4);
//        System.out.println("Area of rectangle" + rectangel.calculateArea());
//
//        javaBasics.Calculator calculator = new javaBasics.Calculator();
//        float sum = calculator.add(5,1.2f);
//        System.out.println("sum of given numbers: " + sum);
//
//        int sum1 = calculator.add(5,5);
//        System.out.println("sum of given numbers: " + sum1);
//
//        System.out.println(calculator.add(20.30d,20.70d));

ConcatString mystr = new ConcatString();
        System.out.println(mystr.str("hello ","World"));
        System.out.println(mystr.str("hello ","world"," this is java"));

    }
}

class Animal2{
    public void makeSound(){
        System.out.println("javaBasics.Animal makes Sound");
    }
}

class Dog2 extends Animal2{
    @Override
    public void makeSound(){
        System.out.println("Dogs Barks");
    }
}

class cat2 extends Animal2{
    @Override
    public void makeSound(){
        System.out.println("cat meows");
    }
}

//example 2

class Shape{
    double calculateArea(){
        return 0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }
}

// polymorphism Method OverLoading..


class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public float add(int a, float b){
        return a+b;
    }
}

//example 2
// concat 2,3 strings

class ConcatString{

    public String str(String a , String b){
        return a+b;
    }

    public String str(String a , String b, String c){
        return a+b+c;
    }

}
