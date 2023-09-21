package com.mycompany.empproject2;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            double commissionRate, double baseSalary) {
        super(empID, empName, empDateHired, empBirthdate, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double commission = super.computeSalary();
        return baseSalary + commission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: $" + baseSalary + "\nTotal Salary: $" + computeSalary();
    }
}
