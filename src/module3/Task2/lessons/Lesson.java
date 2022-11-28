package module3.Task2.lessons;

import module3.Task2.teachers.Teacher;

public class Lesson {
    private String name;
    private String startTime;
    private String endTime;
    private String auditorium;
    private Teacher teacher;

    public Lesson(String name, String startTime, String endTime, String auditorium, Teacher teacher) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.auditorium = auditorium;
        this.teacher = teacher;
    }
}
