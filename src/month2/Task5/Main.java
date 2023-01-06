package month2.Task5;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model = "Apple";
        phone.number = 504;
        phone.receiveCall("Arsen", phone.number);
        System.out.println();
        phone.receiveCall("Arsen", phone);
    }
}
