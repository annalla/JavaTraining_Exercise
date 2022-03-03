package animal;

public class Frog extends Animal {
    private final String sound = "Kvah";

    public Frog(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public String toString() {
        return "Frog{" +
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