import animal.Animal;
import animal.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static double calculateAverageAnimalsAge(List<Animal> animals) {
        double result = 0;
        if (animals == null) return 0;
        for (Animal animal : animals) {
            result += animal.getAge();
        }
        if (animals.size() != 0) {
            result /= animals.size();
        }
        return result;
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat(2, "Mini", Gender.Male));
        animals.add(new Dog(6, "Susu", Gender.Male));
        animals.add(new Frog(-1, "Thu", Gender.Male));
        animals.add(new Kitten(8, "Dragon"));
        animals.add(new Tomcat(7, "Book"));
        int index = 1;
        for (Animal animal : animals) {
            System.out.println(index + ". " + animal + ",Sound: " + animal.sound());
            index++;
        }
        List<Animal> animals2 = new ArrayList<>();
        List<Animal> animals3 = null;
        System.out.println("Average age of animals: " + calculateAverageAnimalsAge(animals));
        System.out.println("Average age of animals(size=0): " + calculateAverageAnimalsAge(animals2));
        System.out.println("Average age of animals(null): " + calculateAverageAnimalsAge(animals3));

    }
}
