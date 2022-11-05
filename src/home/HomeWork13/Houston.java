package home.HomeWork13;

public class Houston extends InhabitedLocality{
    String[] boro = {"Chinatown", "Sawyer Yards", "Theater District", "Mr. Deeds Buys Houses",
            "Downtown Historic District Market Square"};

    public Houston(String supervisor) {
        super(supervisor);
        arrayList.add(this);
    }
    public Houston() {}
}
