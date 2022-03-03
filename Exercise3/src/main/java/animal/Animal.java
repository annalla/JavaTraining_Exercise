package animal;

public abstract class Animal implements ISound {
    protected int age;
    protected String name;
    protected Gender sex;

    public Animal(int age, String name, Gender sex) {
        this.age = age < 0 ? 0 : age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public abstract String sound();
}
