package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stc {
    public static void main(String[] args) {
        Stack <String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");

        System.out.println(st);

        Iterator<String> i = st.iterator();
        
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
