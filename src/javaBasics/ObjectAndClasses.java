package javaBasics;

public class ObjectAndClasses {

    public static void main(String[] args) {
        Car.car();
        Car.person();

        Circle.CArea();
    }
}
 class Car{ //javaBasics.Car is a class
    String brand;
    String model;
    String year;

    String name;
    String occupation;
    int age;

    public static void car(){  //car is a method

        Car myCar = new Car(); //constructor for an object from class javaBasics.Car...name of object is myCar.

        Car tcar = new Car(); // another object from javaBasics.Car class

        myCar.brand ="BMW";
        myCar.model ="x6";
        myCar.year ="2022";

        tcar.brand = "toyota";
        tcar.model = "Camry";
        tcar.year = "1999";

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        System.out.println(tcar.brand +" "+ tcar.model+" " + tcar.year);
    }

    public static void person(){

        Car person = new Car();
        person.name ="Clauida";
        person.occupation ="Student";
        person.age = 20;

        System.out.println(person.name+" "+ person.occupation + " " + person.age);

    }

 }

 class Circle { //class
     double radius; //variable
     double area() { //method
         return Math.PI * radius * radius;
     }

     static void CArea() { //method
         Circle circle1 = new Circle(); //constructor

         circle1.radius = 5.0; // object

         double circle1Area = circle1.area(); //logic

         System.out.println(circle1Area); //print

     }
 }








