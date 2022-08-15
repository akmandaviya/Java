package Static_keyword;

class Counter {
    //without static 
    int count = 0; //will get memory each time when the instance is created 

    Counter() {
        count++;
        System.out.println(count);
    }
}

public class main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

/*Since instance variable gets the memory at the time of object creation,
 each object will have the copy of the instance variable.
If it is incremented, it won't reflect other objects. 
So each object will have the value 1 in the count variable.*/