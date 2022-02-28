package hr.management.human;

public class Student extends Human{
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
