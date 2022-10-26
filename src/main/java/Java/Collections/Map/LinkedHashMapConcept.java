package Java.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept { //3
    public static void main(String[] args) {

        //Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

        //Points to remember:
        //Java LinkedHashMap contains values based on the key.
        //Java LinkedHashMap contains unique elements.
        //Java LinkedHashMap may have one null key and multiple null values.
        //Java LinkedHashMap is non synchronized.
        //Java LinkedHashMap maintains insertion order.
        //The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(2, "Berry");
        map.put(null, "Apple");
        map.put(null, "Kiwi");
        map.put(null, null);
        map.put(3, null);

        //map.remove(1);
        //map.remove(1, "Mango");

        System.out.println(map);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
