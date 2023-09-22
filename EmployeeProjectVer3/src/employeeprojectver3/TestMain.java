
package employeeprojectver3;

import java.time.LocalDate;

public class TestMain {

    public static void main(String[] args) {
        
        System.out.println("HELLO");
        
        HourlyEmployee employee1 = new HourlyEmployee(
                1, new Name("Xander", "Labide"), LocalDate.of(2023, 1, 1), LocalDate.of(2003, 10, 7),
                45.0f, 12.5f
        );
        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(
                2, new Name("Mikee", "Dionson"), LocalDate.of(2023, 1, 15), LocalDate.of(2003, 9, 10),
                750, 3.0f
        );
        CommissionEmployee employee3 = new CommissionEmployee(
                5, new Name("Jacob", "Labide"), LocalDate.of(2023, 1, 1), LocalDate.of(1995, 8, 20),
                0.10, 10000.0
        );
        
        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee(
                4, new Name("John", "Doe"), LocalDate.of(2023, 1, 1), LocalDate.of(1992, 10, 15),
                0.15, 5000.0
        );
        
        employee1.displayInfo();
        System.out.println();
        employee2.displayInfo();
        System.out.println();
        employee3.displayInfo();
        System.out.println();
        employee4.displayInfo();
        System.out.println();
        
    }
    
}
