package Java.Collections.List;

public class LinkedListConcept { //3
    public static void main(String[] args) {

        //Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

        //The important points about Java LinkedList are:
        //Java LinkedList class can contain duplicate elements.
        //Java LinkedList class maintains insertion order.
        //Java LinkedList class is non synchronized.
        //In Java LinkedList class, manipulation is fast because no shifting needs to occur.
        //Java LinkedList class can be used as a list, stack or queue.

        //ArrayList vs LinkedList
        //ArrayList: ArrayList internally uses a dynamic array to store the elements. Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory. An ArrayList class can act as a list only because it implements List only. ArrayList is better for storing and accessing data. The memory location for the elements of an ArrayList is contiguous. Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.
        //LinkedList: LinkedList internally uses a doubly linked list to store the elements. Manipulation with LinkedList is faster because it uses a doubly linked list, so no shifting is required in memory. LinkedList class can act as a list and queue both because it implements List and Deque interfaces. LinkedList is better for manipulating data. The location for the elements of a linked list is not contagious. There is no case of default capacity in a LinkedList.
    }
}
