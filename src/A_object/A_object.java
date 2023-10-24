package A_object;

public class A_object {
    String firstName="Gnanesh";
    static int age=25;

    public static void main(String[] args) {
        A_object obj =new A_object();
        System.out.println(obj);
        System.out.println(obj.firstName);

        A_object obj2 =new A_object();
        System.out.println(obj);
        System.out.println(A_object.age);
    }
}
