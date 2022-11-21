package module2.Task19;

/* Вот так и выглядит общая логика тернарного оператора.

условие ? результат 1 : результат 2
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Man(22);

        String securityAnswer = man.getAge() >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

        System.out.println(securityAnswer);
    }
}
