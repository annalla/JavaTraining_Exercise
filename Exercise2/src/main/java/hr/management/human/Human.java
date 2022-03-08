package hr.management.human;

import java.util.Objects;

public abstract class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = Objects.requireNonNullElse(firstName, "");
        this.lastName = Objects.requireNonNullElse(lastName, "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
