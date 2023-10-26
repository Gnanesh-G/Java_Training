package K_Practice;

public class K_Practice {

    static boolean pair(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == a) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, 1, -40, 20, 6, 8, 7};
        int k = 15;
        boolean result=pair(arr1,k);
        System.out.println(result);
        int[] arr2 = {-5, 4, -2, 16, 8, 9};

        boolean result2=pair(arr2,k);
        System.out.println(result2);

    }



}



