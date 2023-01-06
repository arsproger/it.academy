package month3.Task7;

public class Guitar implements MusicTools {
    private int amountStrings;

    public Guitar(int amountStrun) {
        this.amountStrings = amountStrun;
    }

    public int getAmountStrings() {
        return amountStrings;
    }

    public void setAmountStrings(int amountStrings) {
        this.amountStrings = amountStrings;
    }

    @Override
    public void play() {
        System.out.println("»грает инструмент гитара с количеством струн " + this.amountStrings);
    }
}
