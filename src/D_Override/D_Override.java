package D_Override;

public class D_Override {
    public static void main(String[] args) {
        vehicle obj =new vehicle();
        obj.setWheels(30);
        int res=obj.getWheels();
        System.out.println(res);
        obj.getWheels();
        obj.getColour();

        car obj2=new car();
        obj2.getColour();
        obj2.getWheels();
    }
}
