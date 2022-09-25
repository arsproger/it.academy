package freeCode;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setModel("bmw");
//        car.setYear(2010);
//        car.setColor("black");
//        System.out.println("Модель: " + car.getModel() +
//                "\nГод выпуска: " + car.getYear() +
//                "\nЦвет: " + car.getColor());
//        car.info();
//        int a = car.yearDifference(2022);
//        System.out.printf("Разница: %d", a);
        Airplane airplane = new Airplane("Аэрофлот", 2020, 150, 30);
        airplane.setYear(2021);
        airplane.setLength(250);
        airplane.fuelUp(500);
        airplane.fuelUp(300);
        airplane.info();
    }
}
