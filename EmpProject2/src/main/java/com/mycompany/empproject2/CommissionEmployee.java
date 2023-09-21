package com.mycompany.empproject2;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double sales;
    private double commissionRate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double commissionRate) {
        super();
        this.sales = 0.0;
        this.commissionRate = 0.0;
    }

    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            double sales, double commissionRate) {
        super(empID, empName, empDateHired, empBirthdate);
        this.sales = 5;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            double commissionRate) {
        super(empID, empName, empDateHired, empBirthdate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double computeSalary() {
        if (sales < 50000) {
            return sales * commissionRate;
        } else if (sales < 100000) {
            return sales * 0.20;
        } else if (sales < 500000) {
            return sales * 0.30;
        } else {
            return sales * 0.50;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sales: $" + sales);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Sales: " + sales + "\n"
                + "Commission Rate: " + commissionRate + "\n"
                + "Salary: $" + computeSalary();
    }
}
