package Constructors;

class Base {

  String name;
  
  //constructor 1
  Base() {
    this("");
  }

  //constructor 2
  Base(String name) {
    this.name = name;
    System.out.println("parameterised constructor of base class");
  }
}
  class Derived extends Base  {
    //constructor 3    
    Derived () {
    }
    
     //constructor 4    
    Derived (String name) {
      super(name);
      System.out.println("paramterised constructor of derived class");
    } 
  }

public class cons1 {
    public static void main(String[] args) {
      Derived obj = new Derived("hello world");
  }
}   