package javacollections;
import java.util.*;
public class hashmapjava {
     // Main driver method
     public static void main(String[] args)
     {
         // Create an empty hash map by declaring object
         // of string and integer type
         HashMap<String, Integer> map = new HashMap<>();
  
         // Adding elements to the Map
         // using standard put() method
         map.put("Prince", 10);
         map.put("surya", 30);
         map.put("Nandu", 20);
  
         // Print size and content of the Map
         System.out.println("Size of map is:- "
                            + map.size());
  
         // Printing elements in object of Map
         System.out.println(map);
  
         // Checking if a key is present and if
         // present, print value by passing
         // random element
         if (map.containsKey("vishal")) {
  
             // Mapping
             Integer a = map.get("vishal");
  
             // Printing value for the corresponding key
             System.out.println("value for key"
                                + " Prince is:- " + a);
         }
     }
}
