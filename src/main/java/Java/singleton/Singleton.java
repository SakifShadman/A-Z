package Java.singleton;

public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public void doIt() {
        System.out.println("do your work");
    }
}
