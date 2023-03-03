package Java.practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String st1 = "CAT";
        String st2 = "ACT1";

        boolean flag = true;

        if (st1.length() != st2.length()) {
            flag = false;
        }
        else {
            char[] ch1 = st1.toCharArray();
            char[] ch2 = st2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            flag = Arrays.equals(ch1,ch2);
        }

        if (flag) {
            System.out.println(st1 + " and " + st2 + " is anagram");
        }
        else {
            System.out.println(st1 + " and " + st2 + " is not anagram");
        }
    }

//    public static void isAnagram(String x, String y) {
//
//        String a = x.replaceAll(" ", "");
//        String b = y.replaceAll(" ", "");
//
//        boolean flag = true;
//
//        if (a.length() != b.length()) {
//            flag = false;
//        }
//        else {
//            char[] charA = a.toLowerCase().toCharArray();
//            char[] charB = b.toLowerCase().toCharArray();
//            Arrays.sort(charA);
//            Arrays.sort(charB);
//            flag = Arrays.equals(charA,charB);
//        }
//
//        if (flag) {
//            System.out.println(a + " and " + b + " are anagram");
//        }
//        else {
//            System.out.println(a + " and " + b + " are not anagram");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        isAnagram("CAT","AC1");
//        isAnagram("Mother In Law", "Hitler Woman");
//    }
}
