package module2.Lesson2.Task1;

public class LessonSubject {
    String nameLesson;
    int price;
    int time;

    public void priceFull(LessonSubject ls) {
        System.out.println("Оплата за полный курс по " + ls.nameLesson + ": " + (ls.price * ls.time));
    }
    public void info(LessonSubject ls) {
        System.out.println("Название курса: " + ls.nameLesson +
                "\nОплата в месяц: " + ls.price +
                "\nДлительность курса: " + ls.time);
    }
}
