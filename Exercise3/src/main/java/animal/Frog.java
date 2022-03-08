package animal;

public class Frog extends Animal {

    private final  Enum type = AnimalType.FROG;
    private final String sound = "Kvah";

    public Frog(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public String toString() {
        return "Frog{" +
                "age=" + super.getAge() +
                ", name='" + super.getName() + '\'' +
                ", sex=" + super.getSex() +
                '}';
    }
    @Override
    public Enum getType() {
        return type;
    }

    @Override
    public String sound() {
        return sound;
    }
}