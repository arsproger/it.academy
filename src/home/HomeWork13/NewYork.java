package home.HomeWork13;

public class NewYork extends InhabitedLocality{
    String[] boro = {"Манхэттен (Manhattan)", "Бронкс (The Bronx)", "Бруклин (Brooklyn)", "Куинс (Queens)", "Статен-Айленд (Staten Island)"};

    public NewYork(String supervisor) {
        super(supervisor);
        arrayList.add(this);
    }
    public NewYork() {}
}
