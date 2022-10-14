package practice.FreeCode.Test;

import java.util.Random;

public class Teacher {
    private String nameTeacher, subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int res = random.nextInt(4) + 2;
        String count;
        if (res == 2) {
           count = "�������������������";
        } else if (res == 3) {
            count = "�����������������";
        } else if (res == 4) {
            count = "������";
        }
        else {
            count = "�������";
        }
        System.out.println("������������� " + getNameTeacher() +
                "\n������(�) ��������(��) � ������ " + student.getNameStudent() +
                "\n�� �������� " + subject +
                "\n�� ������ " + res + " (" + count + ")");
    }
}
