package hr.management.human;

public class Student extends Human {
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = (grade >= 0 && grade <= 10) ? grade : 0;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" +super.getLastName() + '\'' +
                ", grade=" + grade +
                '}';
    }
}
