package List;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "William"));
        students.add(new Student(3, "Paul"));
        students.add(new Student(4, "Ben"));
        students.add(new Student(5, "Elia"));

        //System.out.println("Обратный порядок:");
        Collections.reverse(students);
        for (Student i : students) {
            System.out.print(i + " ");
        }

        students.remove(3);
        System.out.println(students);
    }
}
