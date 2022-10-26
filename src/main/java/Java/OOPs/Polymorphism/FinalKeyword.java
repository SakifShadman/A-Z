package Java.OOPs.Polymorphism;

public class FinalKeyword { //5
    public static void main(String[] args) {

        //The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
        //variable
        //method
        //class

        //1) Java final variable
        //If you make any variable as final, you cannot change the value of final variable(It will be constant).

        //2) Java final method
        //If you make any method as final, you cannot override it.

        //3) Java final class
        //If you make any class as final, you cannot extend it.

        //Is final method inherited?
        //Ans: Yes, final method is inherited, but you cannot override it.

        //What is blank or uninitialized final variable?
        //A final variable that is not initialized at the time of declaration is known as blank final variable.

        //Can we initialize blank final variable?
        //Yes, but only in constructor.

        //static blank final variable: A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

        //What is final parameter?
        //If you declare any parameter as final, you cannot change the value of it.

        //Can we declare a constructor final?
        //No, because constructor is never inherited.
    }
}