
package com.mycompany.empproject5;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    
    private float totalHoursWorked;
   private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, Name name, LocalDate empDateHired, LocalDate empBirthdate, float totalHoursWorked, float ratePerHour){
        super(empID, name, empDateHired, empBirthdate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
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
    float overtimeHours = (totalHoursWorked > regularHoursPerWeek) ? (totalHoursWorked - regularHoursPerWeek) : 0.0f;
    return (totalHoursWorked * ratePerHour) + (overtimeHours * ratePerHour * 1.5);
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
