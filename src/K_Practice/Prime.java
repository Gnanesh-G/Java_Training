package K_Practice;
public class Prime {
    public static void main(String[] args) {
        int d;
        for (int n = 2; n < 100; n++) {
            for ( d = 2; d < n; d++) {
                if (n % d == 0) {
                    break;
                }
            }
                if (d == n) {
                    System.out.print(n+" ");
                }
            }

        }

    }
