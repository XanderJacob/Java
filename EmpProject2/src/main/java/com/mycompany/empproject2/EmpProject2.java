package com.mycompany.empproject2;

import java.time.LocalDate;

public class EmpProject2 {

    public static void main(String[] args) {

        HourlyEmployee employee1 = new HourlyEmployee(
                1, "Xander Labide", LocalDate.of(2023, 1, 1), LocalDate.of(2003, 10, 07),
                45.0f, 12.5f
        );

        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(
                2, "Mikee Dionson", LocalDate.of(2023, 1, 15), LocalDate.of(2003, 9, 10),
                750, 3.0f
        );
        
         PieceWorkerEmployee employee3 = new PieceWorkerEmployee(
            3, "Steve Jobs", LocalDate.of(2023, 1, 1), LocalDate.of(1990, 5, 15),
            500, 2.5f
        );

        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee(
                4, "John Doe", LocalDate.of(2023, 1, 1), LocalDate.of(1992, 10, 15),
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
