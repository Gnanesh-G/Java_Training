package K_Practice;
import java.util.Arrays;

public class Subset {
    static boolean pair(int[] arr, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int[] arr2 = {1, 3, 5, 9};
        boolean subset = pair(arr, arr2);
        System.out.println(subset);

        int[] arr3 = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int[] arr4= {6, 3, 8};
        boolean subset2 = pair(arr3, arr4);
        System.out.println(subset2);
    }
}
