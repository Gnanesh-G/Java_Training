package C_Method;

public class C_Method {
    void method(){
        System.out.println("this is a word ");
    }
    void method(String msg){
        System.out.println(msg);
    }
    static int add(){
        return 7+5;
    }

    public static void main(String[] args) {
        C_Method obj=new C_Method();
        obj.method();
        obj.method("Overloading");
        //System.out.println(C_Method.add());
        int sum=C_Method.add();
        System.out.println(sum);
    }
}
