
package com.mycompany.employee.version1;
import java.time.LocalDate;



 class HourlyEmployee {
    
    
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate  empBirthdate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(String empName, LocalDate empDateHired, float totalHoursWorked) {
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.totalHoursWorked = totalHoursWorked;
        ratePerHour = 100.0f;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
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

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    
    public double computeSalary(){
        float regularHoursPerWeek = 8*5;
        float overtimeHours = 0.0f;
        
        if(totalHoursWorked > regularHoursPerWeek){
            overtimeHours = totalHoursWorked - regularHoursPerWeek;
        }
        double salary = (totalHoursWorked * ratePerHour) + (overtimeHours * ratePerHour* 1.5);
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " +  empDateHired);
        System.out.println("Date of Birth" + empBirthdate);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Salary: " + computeSalary());
    }
      @Override
    public String toString() {
        return "Employee Information:\n" +
                "Employee ID: " + empID + "\n" +
                "Employee Name: " + empName + "\n" +
                "Date Hired: " + empDateHired + "\n" +
                "Date of Birth: " + empBirthdate + "\n" +
                "Total Hours Worked: " + totalHoursWorked + "\n" +
                "Rate Per Hour: " + ratePerHour + "\n" +
                "Salary: $" + computeSalary();
    }
}
