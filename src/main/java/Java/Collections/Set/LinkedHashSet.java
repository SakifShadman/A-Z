package Java.Collections.Set;

public class LinkedHashSet { //2
    public static void main(String[] args) {

        //Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. It inherits the HashSet class and implements the Set interface.

        //The important points about the Java LinkedHashSet class are:
        //Java LinkedHashSet class contains unique elements only like HashSet.
        //Java LinkedHashSet class provides all optional set operations and permits null elements.
        //Java LinkedHashSet class is non-synchronized.
        //Java LinkedHashSet class maintains insertion order.

        //Keeping the insertion order in the LinkedHashset has some additional costs, both in terms of extra memory and extra CPU cycles. Therefore, if it is not required to maintain the insertion order, go for the lighter-weight HashMap or the HashSet instead.
    }
}
