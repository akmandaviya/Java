package Static_keyword;

class Counter1 {
    //using static 
    static int count = 0; //will get memory only once and retain its value  

    Counter1() {
        count++;
        System.out.println(count);
    }
}
public class main1 {
    public static void main(String[] args) {
        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        Counter1 c3 = new Counter1();
    }
}

/*static variable will get the memory only once, if any object changes 
the value of the static variable, it will retain its value.*/