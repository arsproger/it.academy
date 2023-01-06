package subject.multithreading.Task7;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // Пулл потоков

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i)); // Передаем 5 заданий
        }

        executorService.shutdown(); // Прекратили передачу новых заданий, и выполнение заданий
        System.out.println("All tasks submitted!");

        executorService.awaitTermination(1, TimeUnit.DAYS); // Ожидание окончания ( предел времени ожидания )

    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Work " + id + " was completed!");
    }
}