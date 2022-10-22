package Java.OOPs.Abstraction;

public class InterfaceConcept { //2
    public static void main(String[] args) {

        //An interface in Java is a blueprint of a class. It has static constants and abstract methods.
        //The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
        //Java Interface also represents the IS-A relationship.
        //It cannot be instantiated just like the abstract class.
        //Since Java 8, we can have default and static methods in an interface.
        //Since Java 9, we can have private methods in an interface.

        //Why use Java interface?
        //There are mainly three reasons to use interface. They are given below.
        //It is used to achieve abstraction.
        //By interface, we can support the functionality of multiple inheritance.
        //It can be used to achieve loose coupling.

        //How to declare an interface?
        //An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.

        //The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.

        //a class extends another class, an interface extends another interface, but a class implements an interface.

        //Multiple inheritance in Java by interface: If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

        //Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
        //Multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.

        //What is marker or tagged interface?
        //An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. They are used to provide some essential information to the JVM so that JVM may perform some useful operation.

        //abstract vs interface
        //abstract: Abstract class can have abstract and non-abstract methods. Abstract class doesn't support multiple inheritance.	Abstract class can have final, non-final, static and non-static variables. The abstract keyword is used to declare abstract class. An abstract class can extend another Java class and implement multiple Java interfaces. An abstract class can be extended using keyword "extends". abstract class achieves partial abstraction (0 to 100%).
        //interface: Interface can have only abstract methods. Interface supports multiple inheritance. Interface has only static and final variables. The interface keyword is used to declare interface. An interface can extend another Java interface only. An interface can be implemented using keyword "implements". whereas interface achieves fully abstraction (100%).


    }
}
