package services;

import entity.Course;
import entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager implements StudentManagerInterface {
    private Map<Integer, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();


    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    @Override
    public void removeStudent(int studentId) {
        students.remove(studentId);
    }

    @Override
    public Student findStudentById(int studentId) {
        return students.get(studentId);
    }

    @Override
    public void addCourseToStudent(int studentId, Course course) {
        Student student = students.get(studentId);
        if (student != null) {
            student.addCourse(course);
            course.addStudent(student);
        }
    }

    @Override
    public List<Student> getStudentsOnCourse(Course course) {

        List<Student> studentsOnCourse = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getCourses().contains(course)) {
                studentsOnCourse.add(student);
            }
        }
        return studentsOnCourse;
    }
}
