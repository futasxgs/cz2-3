import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 4, 6, 8};
        int[] array3 = {7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(filterEvenIndexOddValue(array1))); // [1, 5]
        System.out.println(Arrays.toString(filterEvenIndexOddValue(array2))); // []
        System.out.println(Arrays.toString(filterEvenIndexOddValue(array3))); // [7, 9, 11]
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }

        int[] filtered = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            filtered[i] = result.get(i);
        }

        return filtered;
    }
}