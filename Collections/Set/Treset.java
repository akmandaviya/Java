package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treset {
    public static void main(String[] args) {
        TreeSet <String> tree = new TreeSet<>();

        tree.add("a");
        tree.add("b");
        tree.add("c");
        tree.add("d");

        System.out.println(tree);

        Iterator i = tree.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
