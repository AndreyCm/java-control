import Person.Student;
import Person.Teacher;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            studentList.add(new Student("First name" + i, "Last name" + i, 18 + i));
        }

        for (int i = 0; i < 3; i++) {
            teacherList.add(new Teacher("First name" + i, "Last name" + i,  30 + i, "Position" + i));
        }

        System.out.println("Students List:");
        for (Student student : studentList) {
            System.out.println("First Name: " + student.getFirstName() + "Last Name: " + student.getLastName() + " Age: " + student.getAge());
        }

        System.out.println("Teachers List:");
        for (Teacher teacher : teacherList) {
            System.out.println("First Name: " + teacher.getFirstName() + "Last Name: " + teacher.getLastName() + " Age: " + teacher.getAge() + " Position: " + teacher.getPosition());
        }
    }
}