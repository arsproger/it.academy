package subject.oop.Task4;

/* ������� ����� Animal � ����������� ��� ������ Dog, Cat, Horse.
����� Animal �������� ���������� food, location � ������ makeNoise, eat, sleep. ����� makeNoise,
��������, ����� �������� �� ������� "�����-�� �������� ����".
Dog, Cat, Horse �������������� ������ makeNoise, eat.
�������� ���������� � ������ Dog, Cat, Horse, ��������������� ������ ���� ��������.
�������� ����� ���������, � ������� ���������� ����� void treatAnimal(Animal animal).
����� ���� ����� ������������� food � location ���������� �� ����� ���������.
� ������ main �������� ������ ���� Animal, � ������� �������� �������� ���� ��������� � ��� �����.
� ����� ����������� �� �� ����� � ����������.
*/

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "�����", "������", "����", "������");
        Cat cat = new Cat(4, "����", "�����", "����", "����");
        Horse horse = new Horse(6, "�����", "����������", "����", "�����");
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
