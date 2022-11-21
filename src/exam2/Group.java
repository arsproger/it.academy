package exam2;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private int idGroup;
    private String name;
    private int amountStudent;
    private Student[] students;
    private static ArrayList<Group> groupsList = new ArrayList<>();
    private static ArrayList<Student> studentsList = new ArrayList<>();

    public Group(int idGroup, String name, int amountStudent) {
        this.idGroup = idGroup;
        this.name = name;
        this.amountStudent = amountStudent;
        this.students = new Student[amountStudent];
        groupsList.add(this);
    }

    public Group(String name) {
        this.name = name;
    }

    // Добавление студента в группу
    public static boolean addStudent(String nameGroup, String studentName) {
        Group group = null;
        Student student = null;
        for(Group groupList : groupsList) {
            if(groupList.name.equals(nameGroup))
                group = groupList;
        }
        if(group == null) {
            System.out.println("Нет такой группы!");
            return false;
        }
        for(Student studentList : Group.studentsList) {
            if(studentList.getName().equals(studentName))
                student = studentList;
        }
        if(student == null) {
            System.out.println("Нет такого студента!");
            return false;
        }
        for (int i = 0; i < group.students.length; i++) {
            if(group.students[i] == null) {
                group.students[i] = student;
                return true;
            }
        }
        return false;
    }

    // Поиск по названию группы
    public static void searchGroupStudent(String nameGroup) {
        Group group = null;
        boolean res = false;
        for(Group groupList : Group.groupsList) {
            if(groupList.name.equals(nameGroup)) {
                group = groupList;
            }
        }
        if(group == null) {
            System.out.println("Нет такой группы!");
            return;
        }
        System.out.println("Название группы: " + group.name);
        System.out.print("Студенты группы: ");
        for(Group group1 : group.students) {
            if(group1 != null) {
                System.out.print(group1.name + " | ");
                res = true;
            }
        }
        if(!res)
            System.out.println("У группы " + nameGroup + " еще нет студентов, плиз добавьте их!");
    }

    // Просмотр всех групп и их учеников
    public static void viewAllGroupAndStudent() {
        System.out.print("Группы: ");
        for(Group group : groupsList) {
            System.out.print(group.name + " | ");
        }
        System.out.print("\nУченики: ");
        for(Student student : studentsList) {
            System.out.print(student.getName() + " | ");
        }
    }

    public int getIdGroup() {
        return idGroup;
    }

    public String getName() {
        return name;
    }

    public int getAmountStudent() {
        return amountStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public static ArrayList<Group> getGroupsList() {
        return groupsList;
    }

    public static ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "idGroup=" + idGroup +
                ", name='" + name + '\'' +
                ", amountStudent=" + amountStudent +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
