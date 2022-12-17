package Java.practice;

public class ReverseString {
    //reverse string or palindrome (same after reverse or not)

    public static void main(String[] args) {

        String st = "sakif";
        String t = "";

        for (int i=st.length()-1; i>=0; i--) {
            t = t + st.charAt(i);
        }
        System.out.println(t);

        if (st.equals(t)) {
            System.out.println("It is palindrome");
        }
        else
            System.out.println("It is not palindrome");
    }
}
