package com.mycompany.empproject2;

import java.time.LocalDate;

public class Employee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthdate;

    public Employee() {
    }

    public Employee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public LocalDate getEmpBirthdate() {
        return empBirthdate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birthdate: " + empBirthdate);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n"
                + "Employee Name: " + empName + "\n"
                + "Date Hired: " + empDateHired + "\n"
                + "Birthdate: " + empBirthdate;
    }
}
