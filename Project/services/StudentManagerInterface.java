package services;

import entity.Course;
import entity.Student;
import java.util.List;

public interface StudentManagerInterface {

    void addStudent(Student student);

    void removeStudent(int studentId);

    Student findStudentById(int studentId);

    void addCourseToStudent(int studentId, Course course);

    List<Student> getStudentsOnCourse(Course course);

}
