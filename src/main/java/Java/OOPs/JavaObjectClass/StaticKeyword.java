package Java.OOPs.JavaObjectClass;

public class StaticKeyword { //6

    public static void main(String[] args) {

        //Instance of class: An object that is created using a class is said to be an instance of that class.

        //The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

        //1) Java static variable: If you declare any variable as static, it is known as a static variable.
        //The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
        //The static variable gets memory only once in the class area at the time of class loading.

        //2) Java static method: If you apply static keyword with any method, it is known as static method.
        //A static method belongs to the class rather than the object of a class.
        //A static method can be invoked without the need for creating an instance of a class.
        //A static method can access static data member and can change the value of it.

        //Restrictions for the static method?
        //There are two main restrictions for the static method. They are:
        //The static method can not use non-static data member or call non-static method directly.
        //this and super cannot be used in static context.

        //Why is the Java main method static?
        //Ans: It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

        //3) Java static block:
        //Is used to initialize the static data member.
        //It is executed before the main method at the time of classloading.

        //Can we execute a program without main() method?
        //Ans: No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.
    }
}
