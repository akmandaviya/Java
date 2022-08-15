package Finalize_keyword;

class A {

}
public class main {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.hashCode());
        a1 = null;
        System.gc(); //calling garbage collector
        System.out.println("end of garbage collection");
    }

    @Override
    protected void finalize () {
        System.out.println("finalize method called");
    }
}
