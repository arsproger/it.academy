package home.HomeWork14.Task2;

public class Count {
    private static int numOfCalls;

    public void increment() {
        numOfCalls++;
    }

    public void factorial() {
        int res = 1;
        for (int i = 2; i <= numOfCalls; i++) {
            res *= i;
        }
        System.out.println("Факториал числа " + numOfCalls + " = " + res);
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        Count.numOfCalls = numOfCalls;
    }
}
