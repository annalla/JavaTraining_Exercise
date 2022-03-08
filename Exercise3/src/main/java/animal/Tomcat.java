package animal;

public class Tomcat extends Cat {
    private final Enum type = AnimalType.TOMCAT;

    public Tomcat(int age, String name) {
        super(age, name, Gender.Male);
    }

    @Override
    public Enum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Tomcat{" +
                "age=" + super.getAge() +
                ", name='" + super.getName() + '\'' +
                ", sex=" + super.getSex() +
                '}';
    }
}
