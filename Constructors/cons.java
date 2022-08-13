package Constructors;

class A {
 
    //default constructor
    A() {
       this(5);
       System.out.println("Default constructor");
    }

    //paramterized constructor 1
    A (int a) {
      this(5,10);
      System.out.println(a);
      System.out.println("Parmaterized constructor 1");
    }
   
    //paramterized constructor 2
    A(int a, int b) {
        System.out.println(a + b);
        System.out.println("Parmaterized constructor 2");
    }
  
}
public class cons {
  public static void main(String[] args) {
    new A();
  }
}
