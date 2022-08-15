package Exception;

public class main {
   public static void main(String[] args) {
    int a = 10,b=20;
    System.out.println("line 1" );
    System.out.println(a+b);
    System.out.println("line 2" );

    // System.out.println(a*b);  // -> exception

    //  System.out.println(10/0);
    // System.out.println("line 3");

     try{
         int data = 10/0;
      }catch (ArithmeticException e) {
           System.out.println(e);
      }
       //remaining part of the code
       System.out.println("rest of the code");

    }
}


/*Suppose we have n lines of code 1 to 2 line have no exception they will execute
 the momemt it will se exception rest of the lines will not be executed
 */

 /*to over come this we use try and catch block */