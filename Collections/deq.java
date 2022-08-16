package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class deq {
    public static void main(String[] args) {
        Deque <String> dq = new ArrayDeque<>();

        dq.add("a");
        dq.add("b");
        dq.add("c");
        System.out.println(dq);
        dq.addFirst("x");
        dq.addLast("z");
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeFirst();
        System.err.println(dq);

        for(String str : dq) {
            System.out.println(str);
        }
    }
}
