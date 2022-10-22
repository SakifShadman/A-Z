package Java.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface { //1
    public static void main(String[] args) {

        //Java List vs ArrayList
        //List is an interface whereas ArrayList is the implementation class of List.

        //How to create List
        //The ArrayList and LinkedList classes provide the implementation of List interface.

        //How to convert Array to List
        //We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method.
        String[] array = {"Java", "PHP", "Python", "C#"};
        System.out.println("Printing Array: " + Arrays.toString(array));

        List<String> list = new ArrayList<>();
        for (String s : array) {
            list.add(s);
        }
        System.out.println("Printing list: " + list);


        //How to convert List to Array
        //We can convert the List to Array by calling the list.toArray() method. Let's see a simple example to convert list elements into array.
        List<String> fruit = new ArrayList<>();
        fruit.add("Grape");
        fruit.add("Mango");
        fruit.add("Berry");
        fruit.add("Apple");
        fruit.add("Banana");
        System.out.println("Printing list: " + fruit);

        String[] name = fruit.toArray(new String[fruit.size()]);
        System.out.println("Printing array: " + Arrays.toString(name));

        //Get and Set Element in List:
        //The get() method returns the element at the given index, whereas the set() method changes or replaces the element.

        //Java ListIterator Interface:
        //ListIterator Interface is used to traverse the element in a backward and forward direction.
    }
}
