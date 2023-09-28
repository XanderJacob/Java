
package com.mycompany.empproject4;

import java.time.LocalDate;
public class TestMain {

    public static void main(String[] args) {
        System.out.println("HELLO");
        
        HourlyEmployee emp1 = new HourlyEmployee( 1, new Name("Xander", "Labide"), LocalDate.now(), LocalDate.of(2003, 10, 7), 45, 10.0f);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, new Name("Mikee", "Dionson"), LocalDate.now(), LocalDate.of(2003, 9, 10), 10,25.5f);
        CommissionEmployee emp3 = new CommissionEmployee(3, new Name("Steph", "Curry"), LocalDate.of(2020, 10, 30), LocalDate.of(2001, 1, 5), 10, 90);
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, new Name("Juan", "Dela Cruz"), LocalDate.of(2020, 10, 30), LocalDate.of(1999, 7, 1), 10, 90);
       
    
        
        EmployeeRoster roster = new EmployeeRoster();
        
        roster.addEmployee(emp1);
        roster.addEmployee(emp2);
        roster.addEmployee(emp3);
        roster.addEmployee(emp4);
        
        
        System.out.println("All Employees:");
        roster.displayAllEmployees();
        
        
    }
}
