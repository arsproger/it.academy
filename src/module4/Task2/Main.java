package module4.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter username: ");
        String user = in.readLine();

        Thread hide = new PasswordsHider("Enter password: ");
        hide.start();
        String pass = scanner.nextLine();
        hide.interrupt();
    }

    private static class PasswordsHider extends Thread {
        public PasswordsHider(String prompt) {
            super("Hiding passwords thread");
            System.out.print(prompt);
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.print("\010");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
            }
        }
    }
}
