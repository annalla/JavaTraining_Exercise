package animal;

public class Dog extends Animal {
    private final String sound = "Gau";

    public Dog(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public String sound() {
        return sound;
    }
}