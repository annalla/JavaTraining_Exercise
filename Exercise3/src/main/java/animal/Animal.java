package animal;

public abstract class Animal implements ISound {
    private Enum type ;
    private int age;
    private String name;
    private Gender sex;

    public Animal(int age, String name, Gender sex) {
        this.age = age < 0 ? 0 : age;
        this.name = name;
        this.sex = sex;
    }

    public Enum getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Gender getSex() {
        return sex;
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
