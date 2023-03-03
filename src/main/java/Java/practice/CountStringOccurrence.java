package Java.practice;

public class CountStringOccurrence {

    //count no of occurrence of characters in the string

    public static void main(String[] args) {

        int count = countOccurrences("sakifshadmanarnob", 'a');
        System.out.println(count);
    }

    private static int countOccurrences(String word, char character) {
        int count = 0;

        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
