package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private Integer studentId;
    private List<Course> courses;

    public Student(String name, String surname, Integer studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
        this.courses = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId=" + studentId +
                ", courses=" + courses +
                '}';
    }
}
