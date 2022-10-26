package Java.Collections.Map;

public class HashtableConcept { //5
    public static void main(String[] args) {

        //Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.

        //Points to remember:
        //A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
        //Java Hashtable class contains unique elements.
        //Java Hashtable class doesn't allow null key or value.
        //Java Hashtable class is synchronized.
        //The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.


        //HashMap vs Hashtable?
        //HashMap: HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code. HashMap allows one null key and multiple null values. HashMap is a new class introduced in JDK 1.2. HashMap is fast. We can make the HashMap as synchronized by calling this code, Map m = Collections.synchronizedMap(hashMap);
        //HashTable: Hashtable is synchronized. It is thread-safe and can be shared with many threads. Hashtable doesn't allow any null key or value. Hashtable is a legacy class. Hashtable is slow. Hashtable is internally synchronized and can't be unsynchronized.
    }
}
