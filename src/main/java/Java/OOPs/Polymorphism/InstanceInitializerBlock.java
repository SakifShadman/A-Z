package Java.OOPs.Polymorphism;

public class InstanceInitializerBlock { //4
    public static void main(String[] args) {

        //Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.

        //There are three places in java where you can perform operations:
        //method
        //constructor
        //block

        //What is invoked first, instance initializer block or constructor?
        //it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked.

        //Rules for instance initializer block :
        //There are mainly three rules for the instance initializer block. They are as follows:
        //The instance initializer block is created when instance of the class is created.
        //The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
        //The instance initializer block comes in the order in which they appear.
    }
}
