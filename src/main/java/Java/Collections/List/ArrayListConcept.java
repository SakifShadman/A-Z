package Java.Collections.List;

import java.util.*;

public class ArrayListConcept { //2
    public static void main(String[] args) {

        //Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array.
        //The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.


        //The important points about the Java ArrayList class are:
        //Java ArrayList class can contain duplicate elements.
        //Java ArrayList class maintains insertion order.
        //Java ArrayList class is non synchronized.
        //Java ArrayList allows random access because the array works on an index basis.
        //In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
        //We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.


        ArrayList<String> list = new ArrayList();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        List syncList = Collections.synchronizedList(list); //making it synchronized

        //for loops
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //for-each loops
        for (String s : list) {
            System.out.println(s);
        }

        //iterator(can use for any collections)
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //list iterator(can use for only list)
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        //Get and Set ArrayList: The get() method returns the element at the specified index, whereas the set() method changes the element.

        //How to Sort ArrayList
        //The java.util package provides a utility class Collections, which has the static method sort(). Using the Collections.sort() method, we can easily sort the ArrayList.

        //Capacity represents the total number of elements the array list can contain. Therefore, the capacity of an array list is always greater than or equal to the size of the array list. When we add an element to the array list, it checks whether the size of the array list has become equal to the capacity or not. If yes, then the capacity of the array list increases.
    }
}
