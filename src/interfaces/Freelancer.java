package interfaces;

public class Freelancer implements Payable {

    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("hourlyRate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("hoursWorked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        }
        double overtimeHours = hoursWorked - 40;
        return hourlyRate * 40 + hourlyRate * 1.5 * overtimeHours;
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.println(getPayeeName() + ": $" + calculatePayment());
    }
}
