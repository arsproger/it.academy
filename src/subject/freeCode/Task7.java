package subject.freeCode;

import java.util.Scanner;

        public class Task7 {
            public static void main(String[] args) {
                int min = 0;
                int max = 100;
                int midrange = Math.round((min + max) / 2);
                String strInput = "";
                Scanner scan = new Scanner(System.in);

                System.out.println("«агадайте число от 0 до 100: € угадаю его за 7 попыток!\n" +
                        "„тобы продолжить, введите любое значение:");
                strInput = scan.nextLine();

                while (!strInput.equals("=")) {
                    System.out.println("Ёто число больше, меньше или равно " + midrange + "? " +
                            "¬ведите '+' если больше, '-' если меньше и '=' если равно:");
                    strInput = scan.nextLine();
                    if (strInput.equals("=")) {
                        System.out.println("ќтлично! ¬аше число " + midrange + ". —пасибо за игру ;)");
                        break;
                    } else if (strInput.equals("+")) {
                        //уменьшаем диапазон:
                        min = midrange;

                        //находим новую середину диапазона:
                        midrange = Math.round((min + max) / 2);

                        //если округление сравнило середину с нижней границей, увеличиваем середину на 1:
                        if (min == midrange && midrange!=100) {
                            midrange += 1;
                        }
                    } else if (strInput.equals("-")) {
                        max = midrange;
                        midrange = Math.round((min + max) / 2);
                    }
                }
            }
        }

