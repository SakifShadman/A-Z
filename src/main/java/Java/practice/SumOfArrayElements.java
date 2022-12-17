package Java.practice;

public class SumOfArrayElements {

    //create a method which accepts Array and returns sum of all the elements in array

    public static int sumArray(int[] array) {
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,2,9,4};
        int sum = sumArray(a);
        System.out.println(sum);
    }
}
