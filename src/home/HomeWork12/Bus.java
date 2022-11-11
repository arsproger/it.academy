package home.HomeWork12;

import java.util.Arrays;

public class Bus {
    private int numberOfSeats;
    private static int amountPassenger;
    static Passenger[] array = new Passenger[0];

    public Bus(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public Bus() {}
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getAmountPassenger() {
        return amountPassenger;
    }

    public static void passengerList() {
        for (Passenger passenger : array) {
            System.out.println(passenger);
        }
    }
    public String addPassenger(Passenger passenger) {
        if(amountPassenger >= numberOfSeats) return "Нету мест!";
        else {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = passenger;
            amountPassenger++;
            return "Пассажир добавлен!";
        }
    }
    public static void searchPassenger(String name) {
         for (Passenger passenger : array) {
             if(passenger.getName().equals(name))
                 System.out.println(passenger);
         }
    }
    public static void salaryPerFlight() {
        double salary = 0;
        for (Passenger passenger : array) {
            salary += passenger.getPrice();
        }
        System.out.println("Заработок за рейс: " + salary);
    }

}
