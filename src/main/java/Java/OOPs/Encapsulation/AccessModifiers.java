package Java.OOPs.Encapsulation;

public class AccessModifiers { //2
    public static void main(String[] args) {

        //There are two types of modifiers in Java: access modifiers and non-access modifiers.
        //The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

        //There are four types of Java access modifiers:
        //Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
        //Default: If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within package. It cannot be accessed from outside the package. It provides more accessibility than private. But, it is more restrictive than protected, and public.
        //Protected: The access level of a protected modifier is within the package and outside the package through inheritance only (child class). The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class. It provides more accessibility than the default modifer.
        //Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

        //There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc.

        //Role of Private Constructor
        //If you make any class constructor private, you cannot create the instance of that class from outside the class (means you can not make the object of the class).

        //Java Access Modifiers with Method Overriding
        //If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
    }
}
