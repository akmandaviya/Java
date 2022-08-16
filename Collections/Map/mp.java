package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class mp {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "sonu");
        map.put(1, "anil");
        map.put(3, "ajay");
        map.put(4, "sonu");

        System.out.println(map);

        for(Map.Entry m:map.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
           }  
    }
}
