package home.HomeWork12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Passenger passenger1 = new Passenger(15, "Aibek", 501);
         Passenger passenger2 = new Passenger(20, "Saikal", 502);
         Passenger passenger3 = new Passenger(50, "Arsen", 503);
         Passenger passenger4 = new Passenger(100, "Mirbek", 504);
         Bus bus = new Bus(3);
         System.out.println(bus.addPassenger(passenger1));
         System.out.println(bus.addPassenger(passenger2));
         System.out.println(bus.addPassenger(passenger3));
         System.out.println(bus.addPassenger(passenger4));
         Bus.passengerList();
         Bus.salaryPerFlight();
         Bus.searchPassenger("Arsen");
//         int[] array = new int[1];
//         array[0] = 5;
//         array = Arrays.copyOf(array, array.length + 1);
//         array[1] = 3;
//         System.out.println(Arrays.toString(array));
    }
}
