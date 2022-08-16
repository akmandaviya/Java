package Collections;

import java.util.*;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Banana");
        System.out.println(list); 
        System.out.println(list.size());

      
        Iterator i = list.iterator();
        while(i.hasNext()) {
          System.out.println(i.next());
        }
  }
}