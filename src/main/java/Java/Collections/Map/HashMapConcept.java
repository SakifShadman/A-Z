package Java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept { //2
    public static void main(String[] args) {

        //Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key.
        //HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null elements as well, but there should be only one null key.

        //Points to remember:
        //Java HashMap contains values based on the key.
        //Java HashMap contains only unique keys.
        //Java HashMap may have one null key and multiple null values.
        //Java HashMap is non synchronized.
        //Java HashMap maintains no order.
        //The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

        //HashMap class Parameters
        //K: It is the type of keys maintained by this map.
        //V: It is the type of mapped values.

        HashMap<Integer,String> map=new HashMap<>();
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

        //No Duplicate Key on HashMap
        //You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.

        //Difference between HashSet and HashMap
        //HashSet contains only values whereas HashMap contains an entry(key and value).


        //What is Hashing
        //It is the process of converting an object into an integer value. The integer value helps in indexing and faster searches.

        //What is HashMap
        //HashMap is a part of the Java collection framework. It uses a technique called Hashing. It implements the map interface. It stores the data in the pair of Key and Value. HashMap contains an array of the nodes, and the node is represented as a class. It uses an array and LinkedList data structure internally for storing Key and Value. There are four fields in HashMap.

        //equals(): It checks the equality of two objects. It compares the Key, whether they are equal or not. It is a method of the Object class. It can be overridden. If you override the equals() method, then it is mandatory to override the hashCode() method.
        //hashCode(): This is the method of the object class. It returns the memory reference of the object in integer form. The value received from the method is used as the bucket number. The bucket number is the address of the element inside the map. Hash code of null Key is 0.
        //Buckets: Array of the node is called buckets. Each node has a data structure like a LinkedList. More than one node can share the same bucket. It may be different in capacity.
        //Insert Key, Value pair in HashMap: We use put() method to insert the Key and Value pair in the HashMap. The default size of HashMap is 16 (0 to 15).

        //get() method in HashMap
        //get() method is used to get the value by its Key. It will not fetch the value if you don't know the Key. When get(K Key) method is called, it calculates the hash code of the Key.
    }
}
