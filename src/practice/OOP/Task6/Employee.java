package practice.OOP.Task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
     private String name;
     private String surname;
     private int stage;
     private double price; // Зарплата в час
     private int amountWorking; // Кол-во часов

     static ArrayList<Employee> arrayList = new ArrayList<>();

    public Employee(String name, String surname, int stage, double price, int amountWorking) {
        this.name = name;
        this.surname = surname;
        this.stage = stage;
        this.price = price;
        this.amountWorking = amountWorking;
        arrayList.add(this);
    }
    static public void arrayList() { System.out.println(arrayList); }
    static public void searchEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print name: ");
        String name = scanner.nextLine();
        System.out.print("Print surname: ");
        String surname = scanner.nextLine();
        int count = 0;
        for (Employee employee : arrayList) {
            if (employee.name.equals(name) && employee.surname.equals(surname)) {
                count++;
                employee.info();
            }
        }
        if (count == 0) { System.out.println("Нет такого работника!"); }
    }

    public void info() {
         double salary = this.amountWorking * this.price;
         double premium;
        System.out.println("Name: " + this.name +
                "\nSurname: " + this.surname +
                "\nStage: " + this.stage +
                "\nPrice: " + this.price + '$' +
                "\nAmount working: " + this.amountWorking);

         if(stage == 2 || stage == 3) {
             premium = salary * 5 / 100;
             salary += premium;
         }
         else if(stage == 4 || stage == 5) {
             premium = salary * 8 / 100;
             salary += premium;
         }
         else if(stage > 5) {
             premium = salary * 15 / 100;
             salary += premium;
         }
         System.out.println("Salary: " + salary + "$\n");
     }
    public String getName() { return  name; }

    public void setName(String name) { this.name = name;}

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public int getStage() { return stage; }

    public void setStage(int stage) { this.stage = stage; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getAmountWorking() { return amountWorking; }

    public void setAmountWorking(int amountWorking) { this.amountWorking = amountWorking; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", stage=" + stage +
                ", price=" + price +
                ", amountWorking=" + amountWorking +
                '}';
    }
}
