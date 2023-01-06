package subject.lambda;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable executable) {
        executable.execute();
    }
}

class ExecutableImplementation implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation()); // 1 способ

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello"); // 2 способ
            }
        });

        runner.run(() -> System.out.println("Hello")); // 3 способ
    }
}
