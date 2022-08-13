package Constructors;

class Bike {

    String model;
    String name;
    String color;
    int price;

//----->Default/Non-parameterised 
//    Bike () {
//     System.out.println("default constructor called");
//   }

//-----> Parameterised 
  Bike (String name, int price) {
       System.out.println("paramterised constructor called");
       this.name = name;
       this.price = price;
  }

//----->Copy Constructor
    Bike(Bike b3)  {
        System.out.println("copy constructor called");
       this.model = b3.model;
       this.name = b3.name;
  }

   Bike () { //blank constructor

   }

    public void bikeInfo() {
     System.out.println("My bike is :" + this.model + " " + this.name);
   }

   public void printInfo () {
    System.out.println(this.name);
    System.out.println(this.price);
   }
}

public class main {
    public static void main(String[] args) {

        // Bike b1 = new Bike();
        // b1.color = "black";
        // b1.model = "Hero";
        // b1.name = "Splendor";
        // b1.bikeInfo();

        Bike b1 = new Bike("KTM Duke", 300000);
        b1.printInfo();

        Bike b2 = new Bike();
          b2.model = "Honda";
          b2.name = "Shine";
          

          Bike b3  = new Bike(b2);
          b3.bikeInfo();
    }
}
