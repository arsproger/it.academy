package subject.freeCode;

import java.util.Scanner;

        public class Task7 {
            public static void main(String[] args) {
                int min = 0;
                int max = 100;
                int midrange = Math.round((min + max) / 2);
                String strInput = "";
                Scanner scan = new Scanner(System.in);

                System.out.println("��������� ����� �� 0 �� 100: � ������ ��� �� 7 �������!\n" +
                        "����� ����������, ������� ����� ��������:");
                strInput = scan.nextLine();

                while (!strInput.equals("=")) {
                    System.out.println("��� ����� ������, ������ ��� ����� " + midrange + "? " +
                            "������� '+' ���� ������, '-' ���� ������ � '=' ���� �����:");
                    strInput = scan.nextLine();
                    if (strInput.equals("=")) {
                        System.out.println("�������! ���� ����� " + midrange + ". ������� �� ���� ;)");
                        break;
                    } else if (strInput.equals("+")) {
                        //��������� ��������:
                        min = midrange;

                        //������� ����� �������� ���������:
                        midrange = Math.round((min + max) / 2);

                        //���� ���������� �������� �������� � ������ ��������, ����������� �������� �� 1:
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

