package module2.Lesson1.Task2;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("Pikachu");
        pokemon.setType("Electric");
        pokemon.setHealth(70);
        pokemon.attack();
        pokemon.dodge();
        pokemon.evolve();
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());
        System.out.println(pokemon.getHealth());
    }
}
