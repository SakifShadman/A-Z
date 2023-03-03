package Java.practice;

public class Fibonacci {

    //Fibonacci series

    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int sum = 0;

        int i=0;
        while (i<9) {
            System.out.println(sum);
            sum = a+b;
            a = b;
            b = sum;
            i++;
        }
    }
}