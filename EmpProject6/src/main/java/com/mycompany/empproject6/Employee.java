
package com.mycompany.empproject6;


import java.time.LocalDate;

public abstract class Employee {
    private int empID;
    private Name name;
    private LocalDate empDateHired;
    private LocalDate empBirthdate;

    public Employee() {
    }
    


    public Employee(int empID, Name name, LocalDate empDateHired, LocalDate empBirthdate) {
        this.empID = empID;
        this.name = name;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
    }

    public int getEmpID() {
        return empID;
    }

    public Name getName() {
        return name;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public LocalDate getEmpBirthdate() {
        return empBirthdate;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(LocalDate empBirthdate) {
        this.empBirthdate = empBirthdate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + name);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birthdate: " + empBirthdate);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n"
                + "Employee Name: " + name + "\n"
                + "Date Hired: " + empDateHired + "\n"
                + "Birthdate: " + empBirthdate;
    }
}
