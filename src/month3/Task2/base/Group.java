package month3.Task2.base;

import month3.Task2.teachers.Teacher;
import month3.Task2.students.Student;

public class Group {
    private String title;
    private Student[] students;
    private Teacher teacher;

    public Group(String title, Student[] students, Teacher teacher) {
        this.title = title;
        this.students = students;
        this.teacher = teacher;
    }
}
