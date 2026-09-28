
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Vehicle {

}

class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    Engine engine = new Engine();

    void startCar() {
        engine.start();
    }

    
}




class Processor {
    void process() {
        System.out.println("Processing...");
    }
}

class Macbook {
    Processor processor = new Processor();

    void run(){
        processor.process();
    }
}


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car1 = new Car();

        dog.eat();
        dog.bark();

    }
}
