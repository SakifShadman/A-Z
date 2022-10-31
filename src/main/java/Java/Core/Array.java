package Java.Core;

import java.util.Arrays;

public class Array { //5
    public static void main(String[] args) {
        //An array is a collection of similar type of elements (Contiguous memory location)
        //It does not grow its size at runtime

        int[] array = new int[3]; //declaration and instantiation
        array[0] = 3; //initialization
        array[1] = 11;
        array[2] = 9;

        //traversing array
        //for-loops
        for (int j=0; j<array.length; j++) {
            System.out.println(array[j]);
        }

        //for-each loop
        for (int i : array) {
            System.out.println(i);
        }

        int[] oddNum = {1,3,5,7,9}; //declaration, instantiation and initialization


        //multidimensional array
        String[][] car = new String[2][3];
        car[0][0] = "Toyota";
        car[0][1] = "Lexus";
        car[0][2] = "Honda";
        car[1][0] = "BMW";
        car[1][1] = "Audi";
        car[1][2] = "Benz";

        for (int i=0; i<car.length; i++) {
            for (int j=0; j<car[i].length; j++) {
                System.out.println(car[i][j]);
            }
        }
        //if we are creating odd number of column in 2d array, is knows as jagged array


        //copying an array
        //declaring a source array
        char[] from = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        //declaring a destination array
        char[] to = new char[7];

        //copying array using System.arraycopy()
        System.arraycopy(from, 2, to, 0, 7);

        for (char c : to) {
            System.out.println(c);
        }

        String str = String.valueOf(to);
        System.out.println(str);

        //cloning an array
        int[] number= {1,3,2,6,4};
        int[] clone = number.clone();
        for (int i : clone) {
            System.out.println(i);
        }
        System.out.println("***********");


        //duplicate element of an array
        int[] num= {1,3,2,6,1,6,2,4};
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (num[i]==num[j])
                    System.out.println(num[j]);
            }
        }
        System.out.println("***********");

        //largest, shortest
        int[] num1= {1,3,2,16,41,69,22,4};
        Arrays.sort(num1);
        System.out.println(num1[num1.length-1]);
        System.out.println(num1[num1.length-3]);

        Arrays.sort(num1);
        System.out.println(num1[0]);
        System.out.println(num1[4]);
    }
}
