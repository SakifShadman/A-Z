package Java.OOPs.Encapsulation;

public class JavaPackage { //1
    public static void main(String[] args) {

        //A java package is a group of similar types of classes, interfaces and sub-packages.
        //Package in java can be categorized in two form, built-in package and user-defined package.

        //Advantage of Java Package
        //1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
        //2) Java package provides access protection.
        //3) Java package removes naming collision.

        //How to access package from another package?
        //There are three ways to access the package from outside the package.
        //import package.*: If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages. The import keyword is used to make the classes and interface of another package accessible to the current package.
        //import package.classname: If you import package.classname then only declared class of this package will be accessible. fully qualified name: If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface. It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.

        //If you import a package, all the classes and interface of that package will be imported excluding the classes and interfaces of the subpackages. Hence, you need to import the subpackage as well.

        //Subpackage in java: Package inside the package is called the subpackage. It should be created to categorize the package further.
    }
}
