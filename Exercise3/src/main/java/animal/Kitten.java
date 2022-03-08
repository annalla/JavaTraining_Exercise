package animal;

public class Kitten extends Cat{
    private final Enum type = AnimalType.KITTEN;

    public Kitten(int age, String name) {
        super(age, name, Gender.Female);
    }
    @Override
    public String sound() {
        return super.sound();
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "age=" + super.getAge() +
                ", name='" + super.getName() + '\'' +
                ", sex=" + super.getSex() +
                '}';
    }

    @Override
    public Enum getType() {
        return type;
    }
}
