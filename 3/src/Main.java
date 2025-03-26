import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(rotateArray(arr1, 2))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(rotateArray(arr2, 3))); // [1, 2, 3]
    }

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        int[] rotated = new int[n];

        // чтобы не было выхода за границы при positions > n
        positions = positions % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + positions) % n;
            rotated[newIndex] = array[i];
        }

        return rotated;
    }
}
