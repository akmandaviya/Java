package Abstraction;


interface Animal {
    public void walk ();

}

//multiple inheritance using interface
interface Herbivore {
   
}

class Horse implements Animal,Herbivore {
    @Override
   public void walk () {
    System.out.println("walk with 4 legs");
   }
}

public class main1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
