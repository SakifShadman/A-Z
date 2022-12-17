package Java.practice;

import java.util.ArrayList;

public class UniqueNumbers {

    //print unique numbers in the array

    public static void main(String[] args) {

        int a[] = {4,5,5,5,4,6,6,9,4};

        //4=3, 5=3, 6=2, 9=1

        ArrayList<Integer> al = new ArrayList<>();

        for (int i=0; i<a.length; i++) {
            int k = 0;
            if (!al.contains(a[i])) {
                al.add(a[i]);
                k++;
                for (int j=i+1; j<a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                //System.out.println(a[i] + " is present " + k + " times.");
                if (k==1) {
                    System.out.println(a[i] + " is unique number");
                }
            }
        }
    }
}
