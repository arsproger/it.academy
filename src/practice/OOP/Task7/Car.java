package practice.OOP.Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private String model;
    private int year;
    private double volume;
    private Passenger[] passengers;
    private static ArrayList<Car> carsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Car(String model, int year, double volume, int amountSeats) {
        this.model = model;
        this.year = year;
        this.volume = volume;
        this.passengers = new Passenger[amountSeats];
        carsList.add(this);
    }

    public static void searchCar(String carModel) {
        for(Car car : carsList) {
            if(car.model.equals(carModel)) {
                System.out.print("\nМодель: " + car.model +
                        "\nПассижиры: ");
                for (int i = 0; i < car.passengers.length; i++) {
                    if(car.passengers[i] != null)
                        System.out.print(car.passengers[i].getName() + ", " + car.passengers[i].getAge() + " | ");
                }
                return;
            }
        }
        System.out.println("Нет такой модели!");
    }

    public static void createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Модель машины: ");
        String model = scanner.nextLine();
        System.out.print("Год выпуск машины: ");
        int year = scanner.nextInt();
        System.out.print("Объем двигателя машины: ");
        double volume = scanner.nextDouble();
        System.out.print("Кол-во мест в машине: ");
        int amountSeats = scanner.nextInt();
        new Car(model, year, volume, amountSeats);
        System.out.println("Новая машина создана!");
    }

    public static void createPassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя пассижара: ");
        String name = scanner.nextLine();
        System.out.print("Возраст пассажира: ");
        int age = scanner.nextInt();
        new Passenger(name, age);
        System.out.println("Новый пассажир создан!");
    }

    public static void addPassenger(String modelCar, String namePassenger) {
        for(Car car : carsList) {
            if(car.model.equals(modelCar)) {
                for(Passenger passenger : Passenger.getPassengersList()) {
                    if(passenger.getName().equals(namePassenger)) {
                        for (int i = 0; i < car.passengers.length; i++) {
                            if(car.passengers[i] != null && car.passengers[i].getName().equals(namePassenger)) {
                                System.out.println("Такой пассажир уже есть в машине!");
                                return;
                            }
                            else if(car.passengers[i] == null) {
                                car.passengers[i] = passenger;
                                System.out.println("Пассажир добавлен!");
                                return;
                            }
                        }
                    }
                }
                System.out.println("Нет такого пассажира");
                return;
            }
        }
        System.out.println("Нет такой машины!");
    }

        public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(ArrayList<Car> carsList) {
        this.carsList = carsList;
    }
}
