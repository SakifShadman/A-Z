package Java.Collections.Set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass { //3
    public static void main(String[] args) {

        //Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

        //The important points about the Java TreeSet class are:
        //Java TreeSet class contains unique elements only like HashSet.
        //Java TreeSet class access and retrieval times are quiet fast.
        //Java TreeSet class doesn't allow null element.
        //Java TreeSet class is non synchronized.
        //Java TreeSet class maintains ascending order.

        //Synchronization of The TreeSet Class
        //The TreeSet class is not synchronized. It means if more than one thread concurrently accesses a tree set1, and one of the accessing threads modify it, then the synchronization must be done manually. It is usually done by doing some object synchronization that encapsulates the set1. However, in the case where no such object is found, then the set1 must be wrapped with the help of the Collections.synchronizedSet() method. It is advised to use the method during creation time in order to avoid the unsynchronized access of the set1.
        TreeSet treeSet = new TreeSet();
        Set syncrSet = Collections.synchronizedSet(treeSet);

        //highest and lowest:
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());

        //various NavigableSet operations:
        TreeSet<String> set1 =new TreeSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");
        System.out.println("Initial Set: "+ set1);
        System.out.println("Reverse Set: "+ set1.descendingSet());
        System.out.println("Head Set: "+ set1.headSet("C", true));
        System.out.println("SubSet: "+ set1.subSet("A", false, "E", true));
        System.out.println("TailSet: "+ set1.tailSet("C", false));

        //various SortedSetSet operations:
        TreeSet<String> set2 =new TreeSet<String>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("E");

        System.out.println("Intial Set: "+ set2);
        System.out.println("Head Set: "+ set2.headSet("C"));
        System.out.println("SubSet: "+ set2.subSet("A", "E"));
        System.out.println("TailSet: "+ set2.tailSet("C"));


    }
}
