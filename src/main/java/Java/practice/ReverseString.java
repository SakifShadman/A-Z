package Java.practice;

public class ReverseString {
    //reverse string or palindrome (same after reverse or not)

    public static void main(String[] args) {

        String st = "hello";
        String t = "";

        System.out.println(reverseString(st));

//        for (int i=st.length()-1; i>=0; i--) {
//            t = t + st.charAt(i);
//        }
//        System.out.println(t);
//
//        if (st.equals(t)) {
//            System.out.println("It is palindrome");
//        }
//        else
//            System.out.println("It is not palindrome");
    }

    public static String reverseString(String str){

        String rvs = "";

        for(int i=str.length()-1; i>=0; i--){
            rvs = rvs + str.charAt(i);
        }

        return rvs;
    }
}
