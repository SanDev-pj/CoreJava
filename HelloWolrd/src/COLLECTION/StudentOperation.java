package COLLECTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentOperation {

    static Map<Integer, Student> studentDetails = new HashMap<>();

    public static void addStudent(Student s) {
        studentDetails.put(s.getUser_id(), s);
    }

    public static void viewStudents( ) {
        System.out.printf("\n%-8s %-13s %-26s %-10s","USER ID","NAME","EMAIL","COURSE");
        studentDetails.forEach((key,value)-> System.out.printf("\n%-8d %-13s %-26s %-10s",key,value.getName(),value.getEmail(),value.getCourse()));

    }

    public static void viewStudent(Integer id) {
        System.out.printf("\n\nStudent Details\n");

        Student tempStudentDetail = studentDetails.get(id);

        System.out.printf("\n%s %s %s",tempStudentDetail.getName(),tempStudentDetail.getEmail(),tempStudentDetail.getCourse());
    }
}

class Student {

    private static int user_id = 10001;
    private String name;
    private String email;
    private String course;

    public Student(String name, String email, String course) {
        super();
        user_id++;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public  int getUser_id() {
        return user_id;
    }

    public  void setUser_id(int user_id) {
        Student.user_id = user_id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
class StudentDetailMain {

    public static void main(String[] args) {
        Scanner readVal = new Scanner(System.in);

        for(int i=0; i<3; i++) {

            System.out.printf("\nEnter the Name => ");
            String name = readVal.nextLine();

            System.out.printf("\nEnter the Email => ");
            String email = readVal.nextLine();

            System.out.printf("\nEnter the Course => ");
            String course = readVal.nextLine();

            StudentOperation.addStudent(new Student(name, email, course));

            System.out.println("\n\t\t\tAdded Successfully");
        }
        StudentOperation.viewStudents();
        StudentOperation.viewStudent(10002);
        readVal.close();
    }

}