package animal;

public class Tomcat extends Cat{
    public Tomcat(int age, String name) {
        super(age, name, Gender.Male);
    }
    @Override
    public String sound() {
        return super.sound();
    }

    @Override
    public String toString() {
        return "Tomcat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
