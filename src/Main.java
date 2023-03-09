import practice.animal.Animal;
import practice.animal.Chicken;
import practice.animal.Tiger;
import practice.fruit.Apple;
import practice.fruit.Fruit;
import practice.fruit.Organge;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Animal-----------------");
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        System.out.println("-----------------Fruit-----------------");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Organge();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
