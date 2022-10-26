package Java.OOPs.JavaObjectClass;

public class ConstructorConcept { //5
    public static void main(String[] args) {

        //Constructor is a special type of method which is used to initialize the object.
        //Every time an object is created using the new() keyword, at least one constructor is called. It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
        //There are two types of constructors in Java -
        //default constructor (no-arg constructor): A constructor is called "Default Constructor" when it doesn't have any parameter.
        //parameterized constructor: A constructor which has a specific number of parameters is called a parameterized constructor.

        //Rules for creating Java constructor:
        //Constructor name must be the same as its class name
        //A Constructor must have no explicit return type
        //A Java constructor cannot be abstract, static, final, and synchronized. But we can have private, protected, public or default constructor in Java

        //What is the purpose of a default constructor?
        //The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

        //Why use the parameterized constructor?
        //The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

        //Constructor overloading:
        //In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.
        //Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

        //Constructor vs Method
        //Constructor: A constructor is used to initialize the state of an object. A constructor must not have a return type. The constructor is invoked implicitly. The constructor name must be same as the class name.
        //Method: A method is used to expose the behavior of an object. A method must have a return type. The method is invoked explicitly. The method name may or may not be same as the class name.

        //There are many ways to copy the values of one object into another in Java. They are:
        //By constructor
        //By assigning the values of one object into another
        //By clone() method of Object class

        //Does constructor return any value?
        //Yes, it is the current class instance (You cannot use return type yet it returns a value).

        //Can constructor perform other tasks instead of initialization?
        //Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

        //Is there Constructor class in Java?
        //Yes.

        //What is the purpose of Constructor class?
        //Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.
    }
}
