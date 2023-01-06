package subject.freeCode;

public class Task26 {
    public static void main(String[] args) {
        Me me = new Me();
        Daddy daddy = new Me();
        me.say();
        daddy.say();
    }
}
class Daddy {
    void say() {
        System.out.println("I am Daddy");
    }
}
class Me extends Daddy {
    void say() {
        System.out.println("I am Me");
    }
}
