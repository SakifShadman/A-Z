package Java.Core;

public class Loops {
    public static void main(String[] args) {

        int[] arr = {100,29,13,48,5997};
        //The java loop iterate a part of program several times.
        //-if the number of iteration is fixed we use for loop
        //-if the number of iteration is not fixed we use while loop
        //-if number of iteration not fixed and have to execute at least once, we need to use do-while...


        //while loop
        int i=0;
        while (i<arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("*****************");

        //do-while loop
        int j = 0;
        do {
            System.out.println(arr[j]);
            j++;
        }
        while (j<=arr.length-1);

        //for-loops
//        for (int i=1; i<6; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
