package subject.oop.Task4;

/* Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise,
например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод распечатывает food и location пришедшего на прием животного.
В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте их на прием к ветеринару.
*/

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "Шарик", "Черный", "Мясо", "Москва");
        Cat cat = new Cat(4, "Соня", "Белый", "Корм", "Сочи");
        Horse horse = new Horse(6, "Пегас", "Коричневый", "Сено", "Питер");
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = {dog, cat, horse};
        for (int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
        dog.eat();
        cat.sleep();
        horse.makeNoise();
        dog.info();
        cat.info();
        horse.info();
    }
}
