package module3.Task8;

public enum SEASONS {
    ЗИМА(-30, "Холодное время года"), ВЕСНА(15, "Теплое время года"),
    ЛЕТО(35, "Жаркое время года"), ОСЕНЬ(10, "Прохладное время года");

    double avgTemperature;
    String info;
    SEASONS(double avgTemperature, String info) {
        this.avgTemperature = avgTemperature;
        this.info = info;
    }
}
