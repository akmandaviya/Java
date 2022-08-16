package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class hshset {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
         hs.add("a");
         hs.add("c");
         hs.add("c");
         hs.add("d");

         Iterator i  = hs.iterator();
         while(i.hasNext()) {
            System.out.println(i.next());
         }
    }
}
