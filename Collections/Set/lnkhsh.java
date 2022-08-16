package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class lnkhsh {
    public static void main(String[] args) {
        LinkedHashSet <String> set= new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");

        Iterator i = set.iterator();
         while (i.hasNext()) {
              System.out.println(i.next());
         }
    }
}
