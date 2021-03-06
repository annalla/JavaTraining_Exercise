package hr.management.human;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary < 0 ? 0 : weekSalary;
        this.workHoursPerDay = workHoursPerDay < 0 ? 0 : workHoursPerDay;
    }

    public double earnMoneyPerHour() {
        if (workHoursPerDay == 0) return 0;
        return weekSalary / (workHoursPerDay * 7.0);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", weekSalary=" + weekSalary +
                ", workHoursPerDay=" + workHoursPerDay +
                '}';
    }
}
