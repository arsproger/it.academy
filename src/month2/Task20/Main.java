package month2.Task20;

public class Main {
    public static void main(String[] args) {
        Boing boing = new Boing("Boing", AircraftType.CIVIL);
        Boing boing2 = new Boing("Boing v2", AircraftType.MILITARY);
        System.out.println(boing);
        System.out.println(boing2);

        Tu154 tu154 = new Tu154("Tu154", AircraftType.CIVIL);
        Tu154 tu154v2 = new Tu154("Tu154 v2", AircraftType.MILITARY);
        System.out.println(tu154);
        System.out.println(tu154v2);
    }
}
