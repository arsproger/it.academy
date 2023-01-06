package subject.multithreading.Task17;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
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
        Thread thread = new Thread();

        try {
            int result = future.get(); // get - дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
