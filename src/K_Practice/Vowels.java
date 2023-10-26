package K_Practice;
public class Vowels {
            public static void main(String[] args) {
                String input = "Gnanesh";
                String result = input.replaceAll("[AEIOUaeiou]", "");

                System.out.println("Input: " + input);
                System.out.println("Without Vowels: " + result);
            }
        }



