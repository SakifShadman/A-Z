package Java.practice;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrence {
    public static void main(String[] args) {
        String st = "the quick brown frogs jump over the lazy dog";

        System.out.println(countOccurrence(st));

        HashMap<String, Integer> map = countOccurrence(st);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static HashMap<String, Integer> countOccurrence(String st) {
        String[] array = st.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s,1);
            }
        }
        return map;
    }
}