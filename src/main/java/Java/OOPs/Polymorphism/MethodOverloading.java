package Java.OOPs.Polymorphism;

public class MethodOverloading { //1
    public static void main(String[] args) {

        //If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

        //Different ways to overload the method?
        //There are two ways to overload the method in java
        //By changing number of arguments
        //By changing the data type

        //Why Method Overloading is not possible by changing the return type of method only?
        //In java, method overloading is not possible by changing the return type of the method only because of ambiguity.

        //Can we overload java main() method?
        //Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.

        //Method Overloading and Type Promotion: One type is promoted to another implicitly if no matching datatype is found
        //Byte can be promoted to short, int, long, float or double. The short datatype can be promoted to int, long, float or double. The char datatype can be promoted to int,long,float or double and so on.
        //If there are matching type arguments in the method, type promotion is not performed.
        //If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
    }
}
