package Finally_keyword;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println("inside try block");

            int a = 10/0;
            System.out.println(a);
     } catch (ArithmeticException e) {
        System.out.println(e);
     }


     finally {
        System.out.println("finally block executed");
     }

     System.out.println("rest of the code");
    }
}
