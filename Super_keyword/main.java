package Super_keyword;

class Animal {
    String color = "white";
    
    Animal () {
        System.out.println("animal is created");
    }
    public void eatFood () {
        System.out.println("eating....");
    }
}

class Dog extends Animal {
    String color = "black";
 
    Dog () {
        super();  //invoked parent constructor
        System.out.println("dog is created");
    }
     
    public void printColor () {
        System.out.println(color);
        System.out.println(super.color); // refer parent variable
    }

    public void eatFood () {
        System.out.println("eating biscuits...");
    }
    public void barking () {
        System.out.println("barking....");
    }

    public void doWork () {
        super.eatFood();  //invoking parent method
        barking();
    }
}
public class main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
          d1.printColor();

          Dog d2 = new Dog();
          d2.doWork();
    }
}
