package com.mycompany.empproject2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
        super();
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0f;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthdate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        float regularHoursPerWeek = 8 * 5;
        float overtimeHours = 0.0f;

        if (totalHoursWorked > regularHoursPerWeek) {
            overtimeHours = totalHoursWorked - regularHoursPerWeek;
        }
        double salary = (totalHoursWorked * ratePerHour) + (overtimeHours * ratePerHour * 1.5);
        return salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Total Hours Worked: " + totalHoursWorked + "\n"
                + "Rate Per Hour: " + ratePerHour + "\n"
                + "Salary: $" + computeSalary();
    }

}
