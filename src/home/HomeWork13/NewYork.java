package home.HomeWork13;

public class NewYork extends InhabitedLocality{
    String[] boro = {"��������� (Manhattan)", "������ (The Bronx)", "������� (Brooklyn)", "����� (Queens)", "������-������ (Staten Island)"};

    public NewYork(String supervisor) {
        super(supervisor);
        arrayList.add(this);
    }
    public NewYork() {}
}
