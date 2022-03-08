import animal.Animal;
import animal.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static HashMap<AnimalType, Double> calculateAllAverageAnimalsByType(List<Animal> animals) {
        HashMap<AnimalType, Double> result = new HashMap<>();
        HashMap<AnimalType, List<Animal>> mapAnimal = new HashMap<>();
        for (Animal animal : animals) {
            if (!mapAnimal.containsKey(animal.getType())) {
                mapAnimal.put((AnimalType) animal.getType(), new ArrayList<>());
            }
            mapAnimal.get(animal.getType()).add(animal);
        }
        double average;
        for (Map.Entry<AnimalType, List<Animal>> entry : mapAnimal.entrySet()) {
            average = calculateAverageAnimalsAge(entry.getValue());
            result.put(entry.getKey(), average);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Cat(2, "Mini", Gender.Male));
        animals.add(new Dog(6, "Susu", Gender.Male));
        animals.add(new Frog(4, "Thu", Gender.Male));
        animals.add(new Kitten(8, "Dragon"));
        animals.add(new Tomcat(7, "Book"));
        animals.add(new Kitten(5, "Dragon2"));
        int index = 1;
        for (Animal animal : animals) {
            System.out.println(index + ". " + animal + ",Sound: " + animal.sound());
            index++;
        }
        List<Animal> animals2 = new ArrayList<>();
        System.out.println("Average age of animals: " + calculateAverageAnimalsAge(animals));
        HashMap<AnimalType, Double> animalMap = calculateAllAverageAnimalsByType(animals);
        for (Map.Entry<AnimalType, Double> entry : animalMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        System.out.println("Average age of animals(size=0): " + calculateAverageAnimalsAge(animals2));
        System.out.println("Average age of animals(null): " + calculateAverageAnimalsAge(null));

    }
}
