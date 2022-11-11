package practice.TicTackToe;

import java.util.Scanner;

public class TicTackToe {
    static char[][] array = {{'1', '|', '2', '|', '3'},
                             {'-', '+', '-', '+', '-'},
                             {'4', '|', '5', '|', '6'},
                             {'-', '+', '-', '+', '-'},
                             {'7', '|', '8', '|', '9'}};
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 name: ");
        String player1 = scanner.nextLine();
        System.out.print("Player 2 name: ");
        String player2 = scanner.nextLine();

        System.out.println(player1 + ": x");
        System.out.println(player2 + ": o");
            info();
            while (true) {
                System.out.print(player1 + " print number (1-9) : ");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        array[0][0] = 'X';
                        break;
                    case 2:
                        array[0][2] = 'X';
                        break;
                    case 3:
                        array[0][4] = 'X';
                        break;
                    case 4:
                        array[2][0] = 'X';
                        break;
                    case 5:
                        array[2][2] = 'X';
                        break;
                    case 6:
                        array[2][4] = 'X';
                        break;
                    case 7:
                        array[4][0] = 'X';
                        break;
                    case 8:
                        array[4][2] = 'X';
                        break;
                    case 9:
                        array[4][4] = 'X';
                        break;
                    default:
                        System.out.println("Error, print number 1-9");
                        break;
                }
                info();

                System.out.print(player2 + " print number (1-9) : ");
                int num2 = scanner.nextInt();
                switch (num2) {
                    case 1:
                        array[0][0] = 'O';
                        break;
                    case 2:
                        array[0][2] = 'O';
                        break;
                    case 3:
                        array[0][4] = 'O';
                        break;
                    case 4:
                        array[2][0] = 'O';
                        break;
                    case 5:
                        array[2][2] = 'O';
                        break;
                    case 6:
                        array[2][4] = 'O';
                        break;
                    case 7:
                        array[4][0] = 'O';
                        break;
                    case 8:
                        array[4][2] = 'O';
                        break;
                    case 9:
                        array[4][4] = 'O';
                        break;
                    default:
                        System.out.println("Error, print number 1-9");
                        break;
                }
                info();
                System.out.println();
            }
    }
    public static void info() {
        for(char a[] : TicTackToe.array) {
            for(char aa : a) {
                System.out.print(aa + " ");
            }
            System.out.println();
        }
    }

    public static void checkWinner() {

    }
}
