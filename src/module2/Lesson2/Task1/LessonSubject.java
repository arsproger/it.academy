package module2.Lesson2.Task1;

public class LessonSubject {
    String nameLesson;
    int price;
    int time;

    public void priceFull(LessonSubject ls) {
        System.out.println("������ �� ������ ���� �� " + ls.nameLesson + ": " + (ls.price * ls.time));
    }
    public void info(LessonSubject ls) {
        System.out.println("�������� �����: " + ls.nameLesson +
                "\n������ � �����: " + ls.price +
                "\n������������ �����: " + ls.time);
    }
}
