package home.HomeWork13;

import java.util.ArrayList;

public abstract class InhabitedLocality {
    private String supervisor;
    private NewYork newYork;
    private LosAngeles losAngeles;
    private Houston houston;
    private Sosnovka sosnovka;
    private Pokrovka pokrovka;
    protected static ArrayList<InhabitedLocality> arrayList = new ArrayList<>();

    public InhabitedLocality(String supervisor) {
        this.supervisor = supervisor;
    }

    public InhabitedLocality() {}

    public static void searchSupervisor(String name) {
        for (InhabitedLocality i : arrayList) {
            if (name.equals(i.supervisor)) {
                System.out.println(name + ", руководитель: " + i.getClass().getSimpleName());
            }
        }
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "InhabitedLocality{" +
                "supervisor='" + supervisor + '\'' +
                '}';
    }
}

