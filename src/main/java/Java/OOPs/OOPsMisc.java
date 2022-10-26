package Java.OOPs;

public class OOPsMisc {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    void change(OOPsMisc op) {
        op.data = op.data + 100;
    }

    public static void main(String[] args) {

        //The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.
        //The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.


        //Object Cloning in Java:
        //The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.
        //The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
        //The clone() method is defined in the Object class.

        //Why use clone() method ?
        //The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

        //Advantage of Object cloning
        //You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4- or 5-line long clone() method.
        //It is the easiest and most efficient way for copying objects, especially if we are applying it to an already developed or an old project.
        //Clone() is the fastest way to copy array.


        //Wrapper classes in Java:
        //The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

        //The eight classes of the java.lang package are known as wrapper classes in Java.
        //boolean -> Boolean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float	-> Float
        //double -> Double

        //Autoboxing: The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
        //Unboxing: The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing.

        //Custom Wrapper class in Java:
        //Java Wrapper classes wrap the primitive data types, that is why it is known as wrapper classes. We can also create a class which wraps a primitive data type. So, we can create a custom wrapper class in Java.


        //Call by Value and Call by Reference in Java:
        //There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. The changes being done in the called method, is not affected in the calling method.

        //In case of call by value original value is not changed.
        OOPsMisc obj = new OOPsMisc();

        System.out.println("before change " + obj.data);
        obj.change(500);
        System.out.println("after change " + obj.data);

        //In case of call by reference original value is changed if we made changes in the called method. If we pass object in place of any primitive value, original value will be changed. In this example we are passing object as a value.
        System.out.println("before change " + obj.data);
        obj.change(obj);
        System.out.println("after change " + obj.data);


        //object vs class
        //object: Object is an instance of a class. Object is a real world entity or physical entity. Object is created through new keyword mainly e.g. Student s1=new Student(); Object is created many times as per requirement. Object allocates memory when it is created.
        //class: Class is a blueprint or template from which objects are created. Class is a group of similar objects. Class is a logical entity. Class is declared using class keyword e.g. class Student{}. Class is declared once. Class doesn't allocate memory when it is created.
    }
}
