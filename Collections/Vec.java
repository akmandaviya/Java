package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println(v);

        Iterator <Integer> i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
