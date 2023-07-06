package javaBasics;

public class abstractAndEncapsulation {
    public static void main(String[] args) {

//                javaBasics.Shapes circle = new javaBasics.Circles();
//                circle.draw();
//
//                javaBasics.Shapes rectangle = new javaBasics.Rectangles();
//                rectangle.draw();
//
//                javaBasics.vehicle caru = new javaBasics.Cars("petrol",70.80);
//                caru.start();
//                caru.stop();
//
//                javaBasics.Cars car = new javaBasics.Cars("petrol",20.90);
//                car.start();
//                car.stop();
//
//                javaBasics.Bus bus = new javaBasics.Bus("Diesel",100.20);
//                bus.start();
//                bus.stop();

//        javaBasics.Employee employee = new javaBasics.Employee();
//
//        employee.setName("Driss");
//        employee.setId(1);
//        employee.setSalary(140000.40);
//
//        String name = employee.getName();
//        int id = employee.getId();
//        double salary = employee.getSalary();
//
//        System.out.println("name: " + name);
//        System.out.println("id: " + id);
//        System.out.println("salary: " + salary);
//
//
//        javaBasics.Car1 toyota = new javaBasics.Car1("Toyota","camry",2023);
//
//        String make = toyota.getMake();
//        String model = toyota.getModel();
//        int year = toyota.getYear();
//
//        System.out.println("make is : " + make);
//        System.out.println("model is: " + model);
//        System.out.println("year is: " + year);

    }
}
abstract class Shapes{
    public abstract void draw();
}
class Circles extends Shapes{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangles extends Shapes{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}

abstract class vehicle{
    private int numWheels;
    private String engineType;
    private double fuelCapacity;

    public vehicle(int numWheels, String engineType, double fuelCapacity){
        this.numWheels = numWheels;
        this.engineType= engineType;
        this.fuelCapacity= fuelCapacity;
    }
    public abstract void start();
    public abstract void stop();
}

class Cars extends vehicle{
    public Cars(String engineType,double fuelCapacity){
        super (4,engineType,fuelCapacity);
    }
    public void start(){
        System.out.println("car is starting");
    }

    public void stop(){
        System.out.println("car is stopping");
    }
}
class Bus extends vehicle{
    public Bus(String engineType,double fuelCapacity){
        super(6,engineType,fuelCapacity);
    }

    public void start(){
        System.out.println("bus is Starting");
    }
    public void stop(){
        System.out.println("bus is stopping");
    }
}

//-------------------------Encapsulation-------------------------------

 class Employee{
    private String name;
    private int id;
    private double salary;

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    };

    public double getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Car1 {
    private String make;
    private String model;
    private int year;

    public Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}





