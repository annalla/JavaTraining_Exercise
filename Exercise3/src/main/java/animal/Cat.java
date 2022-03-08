package animal;

public class Cat extends Animal {
    private final  Enum type = AnimalType.CAT;
    protected final String sound = "Meow";

    public Cat(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public Enum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cat{" +
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
