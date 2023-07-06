package javaBasics;

public class CommandExample {
    public static void main(String[] args) {
        String command = "quit";

        switch (command) {
            case "start":
                start();
                break;
            case "stop":
                stop();
                break;
            case "pause":
                pause();
                break;
            case "quit":
                quit();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private static void start() {
        System.out.println("Starting the process...");
        // Code for starting the process
    }

    private static void stop() {
        System.out.println("Stopping the process...");
        // Code for stopping the process
    }

    private static void pause() {
        System.out.println("Pausing the process...");
        // Code for pausing the process
    }

    private static void quit() {
        System.out.println("Quitting the program...");
        // Code for quitting the program
    }
}

