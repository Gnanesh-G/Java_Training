package J_Exception;

public class J_Exception_throw {
    public static void main(String[] args) {
        try {
            new Test().test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            int a = 1/0;

        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Error");
            } else {
                System.out.println(e);
            }
        }
    }
}




class Test {
    void test() throws Exception{
        throw new Exception("custom");
    }
}