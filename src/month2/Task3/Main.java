package month2.Task3;

public class Main {
    public static void main(String[] args) {
        LessonSubject java = new LessonSubject();
        LessonSubject python = new LessonSubject();
        LessonSubject php = new LessonSubject();
        LessonSubject frontend = new LessonSubject();
        LessonSubject basics = new LessonSubject();

        java.nameLesson = "java";
        java.time = 9;
        java.price = 10000;
        java.info(java);
        java.priceFull(java);
        System.out.println();

        php.nameLesson = "php";
        php.time = 8;
        php.price = 7000;
        php.info(php);
        php.priceFull(php);
        System.out.println();

        python.nameLesson = "python";
        python.time = 10;
        python.price = 12000;
        python.info(python);
        python.priceFull(python);
        System.out.println();

        frontend.nameLesson = "frontend";
        frontend.time = 6;
        frontend.price = 15000;
        frontend.info(frontend);
        frontend.priceFull(frontend);
        System.out.println();

        basics.time = 1;
        basics.price = 15000;
        basics.nameLesson = "basics";
        basics.info(basics);
        basics.priceFull(basics);
        System.out.println();

    }
}
