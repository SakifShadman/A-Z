package Java.OOPs.JavaObjectClass;

public class Methods { //4
    public static void main(String[] args) {

        //What is a method in Java?
        //A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. The method is executed only when we call or invoke it.

        //The most important method in Java is the main() method.

        //Method Declaration
        //The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header.
        //Method Signature: Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.
        //Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:
        //Public: The method is accessible by all classes when we use public specifier in our application.
        //Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.
        //Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
        //Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.
        //Return Type: Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.
        //Method Name: It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.
        //Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.
        //Method Body: It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces.


        //Types of Method
        //There are two types of methods in Java:
        //Predefined Method: In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc. When we call any of the predefined methods in our program, a series of codes related to the corresponding method runs in the background that is already stored in the library.
        //User-defined Method: The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement.

        //How to Call or Invoke a User-defined Method?
        //Once we have defined a method, it should be called. The calling of a method in a program is simple. When we call or invoke a user-defined method, the program control transfer to the called method.

        //Static Method: A method that belongs to a class rather than an instance of a class is known as a static method. A method that has static keyword is known as static method.
        //The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.

        //Instance Method: The non-static method of the class is known as an instance method. Before calling or invoking the instance method, it is necessary to create an object of its class.
        //There are two types of instance method:
        //Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method. We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.
        //Mutator Method: The method(s) read the instance variable(s) and also modify the values. We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.

        //Abstract Method: The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must be abstract if it has abstract method. To create an abstract method, we use the keyword abstract.

        //Factory method: It is a method that returns an object to the class to which it belongs. All static methods are factory methods. For example, NumberFormat obj = NumberFormat.getNumberInstance();
    }
}
