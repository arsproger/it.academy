package subject.comparation.Task2;
 // Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();
            Employee emp1 = new Employee(88, "Сергей", "Петров", 15000);
            Employee emp2 = new Employee(12, "Андрей", "Иванов", 40000);
            Employee emp3 = new Employee(57, "Андрей", "Гудков", 27500);
            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            System.out.println("До сортировки:\n" + list);
            Collections.sort(list);
            System.out.println("\nПосле сортировки:\n" + list);
    }

}
class Employee implements Comparable<Employee>{
    Integer id;
    String name, surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", salary = " + salary +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
//        if(this.id == emp.id) {
//            return 0;
//        }
//        else if(this.id < emp.id) {
//            return -1;                           // 1 способ
//        }
//        else {
//            return 1;
//        }
//        return this.id - emp.id;                 // 2 способ
//        return this.id.compareTo(emp.id);        // 3 способ для int сортировка по айди
//        return this.name.compareTo(emp.name);    // 3 способ для String сортировка по имени
          int res = this.name.compareTo(emp.name);
          if(res == 0) {
              res = this.surname.compareTo(emp.surname);   // если имена одинаковы то сортируем по фамилии
          }
          return res;
    }
}
