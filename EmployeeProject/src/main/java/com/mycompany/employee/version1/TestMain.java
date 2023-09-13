package com.mycompany.employee.version1;

import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "Xander", LocalDate.of(2023, 1, 1),
                LocalDate.of(2003, 10, 7), 160.0f, 10.0f);

        PieceWorkerEmployee pieceWorkerEmployee = new PieceWorkerEmployee(2, "Achille", LocalDate.of(2023, 1, 1),
                LocalDate.of(2003, 9, 15), 1.5f);

        CommissionEmployee commissionEmployee = new CommissionEmployee(3, "Carlo", LocalDate.of(2023, 1, 1),
                LocalDate.of(1985, 1, 1), 75000.0);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(4, "Julz",
                LocalDate.of(2023, 1, 1), LocalDate.of(1992, 1, 1), 0.10, 50000.0);

        System.out.println("Hourly Employee:");
        hourlyEmployee.displayInfo();

        System.out.println("\nPiece Worker Employee:");
        pieceWorkerEmployee.displayInfo();

        System.out.println("\nCommission Employee:");
        commissionEmployee.displayInfo();

        System.out.println("\nBase Plus Commission Employee:");
        basePlusCommissionEmployee.displayInfo();
    }
}
