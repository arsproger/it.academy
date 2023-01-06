package subject.oop.Task3;

import java.util.Scanner;

public class Fighter {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Bob", 200, 40);
        Fighter fighter2 = new Fighter("Jack", 300, 25);
        fight(fighter1, fighter2);
    }

    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public static void info(Fighter fighter1, Fighter fighter2) {
        System.out.println(fighter1.name + " = " + fighter1.health + " hp");
        System.out.println(fighter2.name + " = " + fighter2.health + " hp");
    }
    public static void fight(Fighter fighter1, Fighter fighter2) {
        System.out.println("Бойцы: " + fighter1.name + " & " + fighter2.name) ;
        System.out.println("Введите имя бойца который будет начинать атаку!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals(fighter1.name)) {
            while (true) {
               info(fighter1, fighter2);
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health <= 0) {
                    info(fighter1, fighter2);
                    System.out.println(fighter2.name + " Win!");
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health <= 0) {
                    info(fighter1, fighter2);
                    System.out.println(fighter1.name + " Win!");
                    break;
                }
            }
        }
        else if(name.equals(fighter2.name)) {
            while (true) {
                info(fighter1, fighter2);
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health <= 0) {
                    info(fighter1, fighter2);
                    System.out.println(fighter2.name + " Win!");
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health <= 0) {
                    info(fighter1, fighter2);
                    System.out.println(fighter1.name + " Win!");
                    break;
                }
            }
        }
        else {
            System.out.println("Нет такого бойца!");
        }
    }

}
