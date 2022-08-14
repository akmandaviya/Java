package Polymorphism;

//method overridding

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    public void run () {
        System.out.println("Bike is running");
    }
}

public class poly {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.run();
        Vehicle v1 = new Vehicle();
        v1.run();
    }
}
