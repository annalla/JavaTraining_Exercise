package animal;

public class Kitten extends Cat{
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
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
