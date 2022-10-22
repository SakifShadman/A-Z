package Java.Core;

public class JavaException {
    public static void main(String[] args) { //8

        //What is Exception in Java?
        //Exception is an abnormal condition. In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

        //What is Exception Handling?
        //Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

        //Advantage of Exception Handling?
        //The core advantage of exception handling is to maintain the normal flow of the application.


        //The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.
        //1. Exception(IOException, SQLException, ClassNotFoundException, RunTimeException)
        //RunTimeError(ArithmeticException, NullPointerException, NumberFormatException, IndexOutOfBoundException)
        //IndexOutOfBoundException(ArrayIndexOutOfBoundException, StringIndexOutOfBoundException)
        //2. Error(StackOverFlowError, VirtualMachineError, OutOfMemoryError)

        //According to Oracle, there are three types of exceptions:
        //Checked Exception: The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
        //Unchecked Exception: The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are checked at runtime.
        //Error: Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.


        //Java Exception Keywords:
        //try: The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
        //catch: The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
        //finally: The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
        //throw: The "throw" keyword is used to throw an exception.
        //throws: The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

        try {
            int data = 100/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        int[] num = new int[0];
        try {
            num = new int[2];
            num[0] = 11;
            num[1] = 19;
            System.out.println(num[3]);
            System.out.println(num[1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(num[1]);

        //Java try block is used to enclose the code that might throw an exception. It must be used within the method.
        //Java catch block is used to handle the Exception by declaring the type of exception within the parameter.

        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(RuntimeException e)
        {
            System.out.println("RuntimeException Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");

        //In Java, using a try block inside another try block is permitted. It is called as nested try block. Every statement that we enter a statement in try block, context of that exception is pushed onto the stack.

        //Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
        //The finally block follows the try-catch block.
        //For each try block there can be zero or more catch blocks, but only one finally block.


        //The Java throw keyword is used to throw an exception explicitly.
        //We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.
        //We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception.
        //If we throw a checked exception using throw keyword, it is must to handle the exception using catch block or the method must declare it using throws declaration.


        //The Java throws keyword is used to declare an exception.
        //Exception Handling is mainly used to handle the checked exceptions.
        //If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.

        //Which exception should be declared?
        //Ans: Checked exception only, because:
        //unchecked exception: under our control so we can correct our code.
        //error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

        //Can we rethrow an exception?
        //Yes, by throwing same exception in catch block.


        //throw vs throws?
        //Java throw keyword throw an exception explicitly in the code, inside the function. Type of exception Using throw keyword is unchecked exception. We are allowed to throw only one exception at a time.
        //Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code. Type of exception Using throws is checked exceptions only. We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.


        //final vs finally vs finalize?
        //final is the keyword and access modifier which is used to apply restrictions on a class, method or variable. Final keyword is used with the classes, methods and variables. Final method is executed only when we call it.
        //finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not. Finally block is always related to the try and catch block in exception handling. Finally block is executed as soon as the try-catch block is executed.
        //finalize is the method in Java which is used to perform clean up processing just before object is garbage collected. finalize() method is used with the objects. finalize method is executed just before the object is destroyed.

    }
}
