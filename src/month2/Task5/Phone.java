package month2.Task5;

public class Phone {
    int number;
    String model;
    double weight;
    void receiveCall(String name) {
        System.out.println("��� ������: " + name);
    }
    int getNumber() {
        return this.number;
    }
    void receiveCall(String name, int number) {
        System.out.println("��� ������: " + name + "\n����� ��������: " + number);
    }
    void receiveCall(String name, Phone phone) {
        System.out.println("��� ������: " + name + "\n������ ��������: " + phone.model);
    }

}
