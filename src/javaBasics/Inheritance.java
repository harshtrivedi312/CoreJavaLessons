package javaBasics;

public class Inheritance {
    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Breed breed = new Breed();
        breed.type();
        breed.bark();
        breed.eat();
        breed.sleep();



    }
}
class Animal{
    void eat(){
        System.out.println("javaBasics.Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("javaBasics.Dog is barking");
    }
    void sleep(){
        System.out.println("This javaBasics.Animal is sleeping..");
    }
        }

        class Cat extends Animal{
    void meow(){
        System.out.println("javaBasics.Cat is meow");
    }
        }
        class Breed extends Dog{
    void type(){
        System.out.println("I am a Lab");
    }

        }






