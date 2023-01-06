package subject.multithreading.Task5;

public class Main {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.doWork();
    }

    /* synchronized - тело метода может исполняться только одним потоком
       для синхронизации - необходим объект,
       монитор может быть только у одного потока ( он используется неявным образом в synchronized ) */

//    public synchronized void increment() {
//        counter++;
//    }
    public void increment() {
        synchronized (this) {
            counter++;            // -> методы идентичны, но в этом случае используем - synchronized блок
        }
    }
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
                            // дожидание окончания потоков
        thread2.join();

        System.out.println(counter);
    }
}
