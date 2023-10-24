package J_Exception;

public class J_Exception {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4};

            System.out.println(arr[4]);
        }
        catch(Exception g){
            System.out.println("Error");
        }
    }
}
