package home.HomeWork13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NewYork newYork = new NewYork("Эрик Адамс");
        LosAngeles losAngeles = new LosAngeles("Эрик Гарсетти");
        Houston houston = new Houston("Сильвестр Тернер");
        Pokrovka pokrovka = new Pokrovka("Олег Иванов");
        Sosnovka sosnovka = new Sosnovka("Сергей Петров");

        System.out.println(Arrays.toString(newYork.boro));
        System.out.println(Arrays.toString(losAngeles.boro));  // Вывод массива с районами этого города
        System.out.println(Arrays.toString(houston.boro));

        InhabitedLocality.searchSupervisor("Сильвестр Тернер"); // Поиск по имени руководителя,
                                                                     // метод выводит город/село которым он руководит.
    }
}
