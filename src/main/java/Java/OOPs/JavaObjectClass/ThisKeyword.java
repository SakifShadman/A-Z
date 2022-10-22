package Java.OOPs.JavaObjectClass;

public class ThisKeyword { //7
    public static void main(String[] args) {

        //this is a reference variable that refers to the current object.

        //1) this: to refer current class instance variable
        //The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
        //If local variables(formal arguments) and instance variables are different, there is no need to use this keyword
        //It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.

        //2) this: to invoke current class method
        //You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.

        //3) this() : to invoke current class constructor
        //The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
        //Real usage of this() constructor call
        //The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining.
        //Call to this() must be the first statement in constructor.

        //4) this: to pass as an argument in the method
        //The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
        //Application of this that can be passed as an argument: In event handling (or) in a situation where we have to provide reference of a class to another one. It is used to reuse one object in many methods.

        //5) this: to pass as argument in the constructor call
        //We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes.

        //6) this keyword can be used to return current class instance
        //We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).


    }
}
