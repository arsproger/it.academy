package month3.Task2;

import month3.Task2.enums.Gender;
import month3.Task2.base.Group;
import month3.Task2.lessons.Lesson;
import month3.Task2.students.Student;
import month3.Task2.teachers.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arsen", 17, Gender.MAN, 1, "Programming");
        Teacher teacher = new Teacher("Argen", 25, Gender.MAN, "Programmer", "Backend");
        Student[] students = {student};
        Group group = new Group("Java", students, teacher);
        Lesson lesson = new Lesson("Java", "September", "June", "8.5", teacher);

    }
}
