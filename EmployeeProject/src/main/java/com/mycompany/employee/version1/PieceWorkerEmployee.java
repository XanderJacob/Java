package com.mycompany.employee.version1;

import java.time.LocalDate;

public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthdate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    // Default constructor
    public PieceWorkerEmployee() {
    }

    // Constructor for a new employee (minimum wage)
    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 1.0f; // Minimum wage
    }

    // Constructor for a regular employee with specified ratePerPiece
    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate,
            float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    // Mutators (setters)
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

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    // Method to compute the salary
    public double computeSalary() {
        int bonusPieces = totalPiecesFinished / 100;
        double salary = totalPiecesFinished * ratePerPiece + bonusPieces * 10 * ratePerPiece;
        return salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthdate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: $" + ratePerPiece);
        System.out.println("Salary: $" + computeSalary());
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee Information:\n"
                + "Employee ID: " + empID + "\n"
                + "Employee Name: " + empName + "\n"
                + "Date Hired: " + empDateHired + "\n"
                + "Date of Birth: " + empBirthdate + "\n"
                + "Total Pieces Finished: " + totalPiecesFinished + "\n"
                + "Rate Per Piece: $" + ratePerPiece + "\n"
                + "Salary: $" + computeSalary();
    }
}
