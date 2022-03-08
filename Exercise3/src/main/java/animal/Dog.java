package animal;

public class Dog extends Animal {
    private final Enum type = AnimalType.DOG;
    private final String sound = "Gau";
    @Override
    public Enum getType() {
        return type;
    }

    public Dog(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + super.getAge() +
                ", name='" + super.getName() + '\'' +
                ", sex=" + super.getSex() +
                '}';
    }

    @Override
    public String sound() {
        return sound;
    }
}