package Java.OOPs.Polymorphism;

public class SuperKeyword { //3
    public static void main(String[] args) {

        //The super keyword in Java is a reference variable which is used to refer immediate parent class object.
        //Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

        //1) super is used to refer immediate parent class instance variable.
        //We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

        //2) super can be used to invoke parent class method
        //The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

        //3) super is used to invoke parent class constructor.
        //The super keyword can also be used to invoke the parent class constructor.

        //super() is added in each class constructor automatically by compiler if there is no super() or this().
        //As we know well that default constructor is provided by compiler automatically if there is no constructor. But, it also adds super() as the first statement.
    }
}
