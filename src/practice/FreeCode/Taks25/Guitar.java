package practice.FreeCode.Taks25;

public class Guitar implements Tool {
    int amountString;
    public Guitar(int amountString) {
        this.amountString = amountString;
    }

    @Override
    public void play() {
        System.out.println("»грает инструмент гитара, с количеством струн " + amountString);
    }
}
