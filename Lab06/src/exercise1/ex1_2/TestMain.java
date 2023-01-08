package exercise1.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Staff staff1 = new Staff("hoaithuong", "hanoi","KHTN",6.5);
        System.out.println("School is :" + staff1.getSchool());
        System.out.println("Address is :" + staff1.getAddress());
        System.out.println(staff1.toString());
        Student student = new Student("hoaithuong", "hanoi","OOP",2003,68);
        System.out.println(student.toString());

  }
}
