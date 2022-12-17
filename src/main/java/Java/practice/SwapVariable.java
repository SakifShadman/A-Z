package Java.practice;

public class SwapVariable {

    //swap the variable without variable(temp)

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        a = a+b; //a=9
        b = a-b; //b=5
        a = a-b; //a=4

        System.out.println("a = " + a + " and b = " + b);
    }
}
