import java.util.ArrayList;
import java.util.List;

public class Homework12 {

    public static void main(String[] args) {
        int[] array = {2,3,1};

        Object[] copyArray = copyAnArray(array);
        for (Object ob : copyArray) {
            System.out.println(ob);
        }
    }

    public static Object[] copyAnArray(int[] array) {
        List<Integer> list = new ArrayList<>();

         for (int i : array) {
             list.add(i);
         }

         Object[] copyArray = list.toArray(new Integer[list.size()]);
         return copyArray;
    }
}