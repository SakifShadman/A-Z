package Java.Core;

public class MainMethod { //1

    public static void main(String[] args) { //no override, but can overload

    }

    public void main() {

    }
    //The main method is static so the JVM can directly call the main method without creating the object of the class
    //The main method is public so JVM can call it directly. We can't make it private or protected or default.
    //the return type of main method is always void.
    //An argument of the main() method must be a String array [(String[] args)]
    //main() method can be final.
}
