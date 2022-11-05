package home.HomeWork13;

public class LosAngeles extends InhabitedLocality{
    String[] boro = {"Даунтаун (центр)", "Истсайд (восточный район)", "Голливуд", "Вилшир (западнее Даунтауна)", "Вестсайд (западный район)"};

    public LosAngeles(String supervisor) {
        super(supervisor);
        arrayList.add(this);
    }

}
