package subject.oop.Task6;

import static subject.oop.Task6.Employee.arrayList;
import static subject.oop.Task6.Employee.searchEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergey", "Ivanov", 3, 5, 43);
        employee1.setStage(5);
        Employee employee2 = new Employee("Igor", "Semenov", 2, 4, 78);
        employee2.setAmountWorking(83);
        searchEmployee();
    }
}
