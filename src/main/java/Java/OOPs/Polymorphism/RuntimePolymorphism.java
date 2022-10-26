package Java.OOPs.Polymorphism;

public class RuntimePolymorphism { //6
    public static void main(String[] args) {

        //Runtime polymorphism (or Dynamic Method Dispatch) is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
        //In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

        //Upcasting: If the reference variable of Parent class refers to the object of Child class, it is known as upcasting (Top casting). For example:
        //class A{}
        //class B extends A{}
        //A a=new B();//upcasting
        //For upcasting, we can use the reference variable of class type or an interface type.

        //Java Runtime Polymorphism with Data Member: A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
    }
}
