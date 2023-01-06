package subject.multithreading.Task16;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                Thread.sleep(3000);
                System.out.println("Finished");
                Random random = new Random();
                return random.nextInt(10);
            }
        });

        executorService.shutdown();
    }
}
