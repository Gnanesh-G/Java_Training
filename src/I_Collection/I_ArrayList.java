package I_Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class I_ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student(1, "Gnanesh"));
        arrayList.add(new Student(2, "yokesh"));
        arrayList.add(new Student(3, "hari"));

        //Using Costructor
        Student std=new Student(4,"ragu");
        std .setName("setter");
        std.setRollno(5);
        arrayList.add(std);
        arrayList.get(1).setName("selvin");
        arrayList.add(new Student(6,"arul"));

        //To update item in the list
        arrayList.set(4,new Student(4,"ram"));
        for(Student student:arrayList){
            System.out.println(student.getName());
        }

        //Using Remove
        arrayList.remove(std);
        arrayList.remove(arrayList.get(0));
        for (Student student:arrayList) {
            System.out.println(student.getName());
            System.out.println(student.getRollno());
        }

        //Using LinkedList
        LinkedList<Student>linkedList=new LinkedList<>();
        linkedList.add(0 ,new Student(7,"ABCD"));
        System.out.println("Linkedlist");
        for(Student student:arrayList){
            System.out.println(student.getName());
        }
    }
}