package Java.practice;

import java.util.Arrays;

public class SortArray {

    //Sort the array in ascending and descending order

    public static void main(String[] args) {

        int a[] = {2,6,1,4,9};

        int temp;

        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.println(i);
        }
    }
}