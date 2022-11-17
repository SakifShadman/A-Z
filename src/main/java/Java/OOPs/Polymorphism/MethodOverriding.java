package Java.OOPs.Polymorphism;

public class MethodOverriding { //2
    public static void main(String[] args) {

        //If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

        //Usage of Java Method Overriding:
        //Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
        //Method overriding is used for runtime polymorphism

        //Rules for Java Method Overriding
        //The method must have the same name as in the parent class
        //The method must have the same parameter as in the parent class.
        //There must be an IS-A relationship (inheritance).

        //Can we override static method?
        //No, a static method cannot be overridden. It can be proved by runtime polymorphism.

        //Why we can not override static method?
        //It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

        //Can we override java main method?
        //No, because the main is a static method.

        //Difference between method Overloading and Method Overriding in java
        //Method overloading is used to increase the readability of the program. Method overloading is performed within class. In case of method overloading, parameter must be different. Method overloading is the example of compile time polymorphism.
        //Method overriding is used to provide the specific implementation of the method that is already provided by its super class. Method overriding occurs in two classes that have IS-A (inheritance) relationship. In case of method overriding, parameter must be same. Method overriding is the example of run time polymorphism.

        //Covariant Return Type: The covariant return type specifies that the return type may vary in the same direction as the subclass.
    }
}
