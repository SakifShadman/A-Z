package Java.practice;

public class MultiplicationTable {

    //Print 5 Multiplication table without using Multiply operator

    public static int multiply(int i, int j){
        //i have to sum itself j times to get result

        int sum = 0;

        int k=1;
        while (k<=j) {
            sum = sum + i;
            k++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int multiply = multiply(5,10);
        System.out.println(multiply);
    }
}
