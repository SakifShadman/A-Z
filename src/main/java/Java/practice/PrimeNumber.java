package Java.practice;

public class PrimeNumber {

    //check if given number is prime

    public static void main(String[] args) {

        int num = 11;
        boolean flag = false;

        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " is not prime");
        }
        else {
            System.out.println(num + " is prime");
        }
    }







//    public static void main(String[] args) {
//
//        String check = isPrime(8);
//        System.out.println(check);
//    }
//
//    public static String isPrime(int value) {
//        boolean flag = false;
//
//        for (int i=2; i<value; i++) {
//            if (value % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag)
//            return "It is not prime";
//        else
//            return "It is prime";
//    }
}
