package practice.FreeCode.Taks25;

public class Guitar implements Tool {
    int amountString;
    public Guitar(int amountString) {
        this.amountString = amountString;
    }

    @Override
    public void play() {
        System.out.println("������ ���������� ������, � ����������� ����� " + amountString);
    }
}
