package Java.OOPs.Abstraction;

abstract class AbstractClass { //1
    public static void main(String[] args) {

        //Abstraction is a process of hiding the implementation details and showing only functionality to the user.
        //Another way, it shows only essential things to the user and hides the internal details.
        //Abstraction lets you focus on what the object does instead of how it does it.

        //Ways to achieve Abstraction
        //There are two ways to achieve abstraction in java
        //Abstract class (0 to 100%)
        //Interface (100%)

        //Points to Remember
        //An abstract class must be declared with an abstract keyword.
        //It can have abstract and non-abstract methods.
        //It cannot be instantiated.
        //It can have constructors and static methods also.
        //It can have final methods which will force the subclass not to change the body of the method.

        //Abstract class in Java: A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.
        //Abstract Method in Java: A method which is declared as abstract and does not have implementation is known as an abstract method.

        //An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
    }
}