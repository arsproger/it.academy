package subject.freeCode;

// ������ ������� ������
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("������� \"start\" ��� ������ ����!");
            String start = scanner.nextLine();
            if(!start.equals("start")) {
                System.out.println("������! ���������� �����");
                break;
            }
            String play = null;
            int n = random.nextInt(1, 4);
            switch (n) {
                case 1: play = "������"; break;
                case 2: play = "�������"; break;
                case 3: play = "������"; break;
            }
            System.out.println("��������: \n������ || ������� || ������");
            String go = scanner.nextLine();
            if(play.equals("������") && go.equals("�������") ||
                    play.equals("�������") && go.equals("������") ||
                    play.equals("������") && go.equals("������")) {
                System.out.println("����� ������: " + play + "\n�� ������: " + go);
                System.out.println("�� ���������");
                break;
            }
            else if(play.equals("������") && go.equals("������") ||
                    play.equals("������") && go.equals("�������") ||
                    play.equals("�������") && go.equals("������")) {
                System.out.println("����� ������: " + play + "\n�� ������: " + go);
                System.out.println("�� ��������");
                break;
            }
            else if(play.equals("������") && go.equals("������") ||
                    play.equals("������") && go.equals("������") ||
                    play.equals("�������") && go.equals("�������")) {
                System.out.println("����� ������: " + play + "\n�� ������: " + go);
                System.out.println("�������� ������");
                break;
            }
            else {
                System.out.println("������! ���������� �����");
                break;
            }

        }
    }
}
