
package com.mycompany.employee.version1;
import java.time.LocalDate;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthdate;
    private double sales;
    private double commissionRate;

    // Default constructor
    public CommissionEmployee() {
    }

    // Constructor for a new employee (minimum commission rate)
    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.sales = 0.0;
        this.commissionRate = 0.05; // 5% for low sales
    }

    // Constructor for a regular employee with specified commission rate
    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            double commissionRate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.sales = 0.0;
        this.commissionRate = commissionRate;
    }

    // Accessors (getters)
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

    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

   
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthdate(LocalDate empBirthdate) {
        this.empBirthdate = empBirthdate;
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

   
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthdate);
        System.out.println("Sales: $" + sales);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Salary: $" + computeSalary());
    }

    
    @Override
    public String toString() {
        return "Employee Information:\n" +
                "Employee ID: " + empID + "\n" +
                "Employee Name: " + empName + "\n" +
                "Date Hired: " + empDateHired + "\n" +
                "Date of Birth: " + empBirthdate + "\n" +
                "Sales: $" + sales + "\n" +
                "Commission Rate: " + (commissionRate * 100) + "%\n" +
                "Salary: $" + computeSalary();
    }
}