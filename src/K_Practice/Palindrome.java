package K_Practice;

public class Palindrome {
    public static void main(String[] args) {
        String a = "Gnanesh";
        String rev = "";
        for (int i = a.length() - 1; i >=0; i--) {
            rev+=a.charAt(i);
        }
    if(a==rev){
        System.out.println("It's a Palindrome");
    }
    else {
        System.out.println("It is not a palindrome");
    }
    }
}