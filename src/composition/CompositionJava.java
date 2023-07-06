package composition;

public class CompositionJava {
    public static void main(String[] args) {

        Engine engine = new Engine("V6");
        Car car = new Car("Toyota", "Camry", engine);

        car.startCar();
        car.stopCar();
    }
}
///composition in java

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}

class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting the car");
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping the car");
        engine.stop();
    }
}
