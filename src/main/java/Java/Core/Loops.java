package Java.Core;

public class Loops { //4
    public static void main(String[] args) {

        //The java loop iterate a part of program several times.
        //if the number of iteration is fixed we use for loop
        //if the number of iteration is not fixed we use while loop
        //if number of iteration not fixed and have to execute at least once, we need to use do-while...
        //we use for-each loop only for array and collections

        int[] arr = {100,29,13,48,5997};

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

        // while vs do-while
        //while loop checks the condition first then executes the statement
        //but do-while loop will execute the statement at least once, then checked the condition

        //for-loops
//        for (int i=1; i<6; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
