package animal;

public class Cat extends Animal {
    protected final String sound = "Meow";

    public Cat(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public String toString() {
        return "Cat{" +
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
