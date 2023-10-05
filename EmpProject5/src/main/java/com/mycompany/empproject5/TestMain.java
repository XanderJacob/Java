package com.mycompany.empproject5;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {
     
        HourlyEmployee emp1 = new HourlyEmployee(1, new Name("Xander", "Labide"), LocalDate.now(), LocalDate.of(2003, 10, 7), 45, 10.0f);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, new Name("Mikee", "Dionson"), LocalDate.now(), LocalDate.of(2003, 9, 10), 10, 25.5f);
        CommissionEmployee emp3 = new CommissionEmployee(3, new Name("Steph", "Curry"), LocalDate.of(2020, 10, 30), LocalDate.of(2001, 1, 5), 10, 90);
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, new Name("Juan", "Dela Cruz"), LocalDate.of(2020, 10, 30), LocalDate.of(1999, 7, 1), 10, 90);

        ArrayList<Employee> roster = new ArrayList<>();

        roster.add(emp1);
        roster.add(emp2);
        roster.add(emp3);
        roster.add(emp4);

        System.out.println("All Employees:");
        for (Employee employee : roster) {
            employee.displayInfo();
            System.out.println("");
        }

        EmployeeRoster employeeRoster = new EmployeeRoster(roster);

        HourlyEmployee emp5 = new HourlyEmployee(5, new Name("John", "Doe"), LocalDate.now(), LocalDate.of(2000, 5, 15), 40, 15.0f);
        employeeRoster.addEmployee(emp5);

        
 
        employeeRoster.displayEmployeeByType("H");
        employeeRoster.displayEmployeeByType("C");
        employeeRoster.displayEmployeeByType("B");
        employeeRoster.displayEmployeeByType("P");
    }
}
