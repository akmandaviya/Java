package Error;

public class main {
    public static void recursiveMethod (int a ) {
        while( a != 0) {
            a = a + 1;
            recursiveMethod(a);
        }
    }
    public static void main(String[] args) {
        recursiveMethod(10);
    }
}
// stack overflow error