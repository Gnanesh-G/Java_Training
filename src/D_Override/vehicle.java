package D_Override;

public class vehicle {
    public vehicle() {
        System.out.println("vehicle constructor-called");
    }
public vehicle(int a ){
    System.out.println("vehicle constructor"+a);}
    private int wheels = 4;

    void getColour() {
        System.out.println("Green");
    }

    int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
}
