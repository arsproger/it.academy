package month3.Task2.students;

import month3.Task2.enums.Gender;
import month3.Task2.base.Person;

public class Student extends Person {
    private int course;
    private String faculty;

    public Student(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Student(String name, int age, Gender gender, int course, String faculty) {
        super(name, age, gender);
        this.course = course;
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFacilty(String faculty) {
        this.faculty = faculty;
    }
}
