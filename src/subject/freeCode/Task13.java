package subject.freeCode;

// Камень Ножницы Бумага
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Введите \"start\" для начала игры!");
            String start = scanner.nextLine();
            if(!start.equals("start")) {
                System.out.println("Ошибка! Попробуйте снова");
                break;
            }
            String play = null;
            int n = random.nextInt(1, 4);
            switch (n) {
                case 1: play = "Камень"; break;
                case 2: play = "Ножницы"; break;
                case 3: play = "Бумага"; break;
            }
            System.out.println("Выберите: \nКамень || Ножницы || Бумага");
            String go = scanner.nextLine();
            if(play.equals("Камень") && go.equals("Ножницы") ||
                    play.equals("Ножницы") && go.equals("Бумага") ||
                    play.equals("Бумага") && go.equals("Камень")) {
                System.out.println("Робот выбрал: " + play + "\nТы выбрал: " + go);
                System.out.println("Вы проиграли");
                break;
            }
            else if(play.equals("Камень") && go.equals("Бумага") ||
                    play.equals("Бумага") && go.equals("Ножницы") ||
                    play.equals("Ножницы") && go.equals("Камень")) {
                System.out.println("Робот выбрал: " + play + "\nТы выбрал: " + go);
                System.out.println("Вы победили");
                break;
            }
            else if(play.equals("Камень") && go.equals("Камень") ||
                    play.equals("Бумага") && go.equals("Бумага") ||
                    play.equals("Ножницы") && go.equals("Ножницы")) {
                System.out.println("Робот выбрал: " + play + "\nТы выбрал: " + go);
                System.out.println("Победила дружба");
                break;
            }
            else {
                System.out.println("Ошибка! Попробуйте снова");
                break;
            }

        }
    }
}
