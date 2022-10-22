package Java.Collections.Mixed;

public class CollectionsClass { //2
    public static void main(String[] args) {

        //Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

        //The important points about Java Collections class are:
        //Java Collection class supports the polymorphic algorithms that operate on collections.
        //Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.


        //Sorting in Collection:
        //We can sort the elements of:
        //String objects
        //Wrapper class objects
        //User-defined class objects

        //Collections class provides static methods for sorting the elements of a collection. If collection elements are of a Set type, we can use TreeSet. However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.

        //Method of Collections class for sorting List elements
        //public void sort(List list): is used to sort the elements of List. List elements must be of the Comparable type.

        //Note: String class and Wrapper classes implement the Comparable interface. So if you store the objects of string or wrapper classes, it will be Comparable.

    }
}
