import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysLearning {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 5, 6, 2, 3, 4));
        System.out.println(list);

        // Sort method
        Collections.sort(list);

        System.out.println(list);
        // search method
        Collections.binarySearch(list, 4);

        // reverse ans shuffle method
        Collections.shuffle(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.frequency(list, Integer.valueOf(5));

        Collections.rotate(list, 2);

        System.out.println(list);
    }
}