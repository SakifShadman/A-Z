package Java.practice;

public class MultiArray {

    //minimum and maximum from a multi array

    public static void main(String[] args) {

        int array[][] = {{2,4,5},{3,9,7},{1,2,8}};

        int min = array[0][0];

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
