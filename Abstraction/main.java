package Abstraction;
//using abstract classes

abstract class Bike {
    abstract void run();
}

class Hero extends Bike {

    void run() {
        System.out.println("running safely");

    }

}

public class main {
    public static void main(String[] args) {
        Bike b1 = new Hero();
        b1.run();
    }
}
