package employeeprojectver3;

import java.time.LocalDate;


public class PieceWorkerEmployee extends Employee{
    private int totalPieceFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }
    
    public PieceWorkerEmployee(int totalPieceFinished) {
        super();
        this.totalPieceFinished = 0;
        this.ratePerPiece = 0.0f;
    }
    
      public PieceWorkerEmployee(int empID, Name name, LocalDate empDateHired, LocalDate empBirthdate,
        int totalPiecesFinished, float ratePerPiece) {
        super(empID, name, empDateHired, empBirthdate);
        this.totalPieceFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPieceFinished() {
        return totalPieceFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setTotalPieceFinished(int totalPieceFinished) {
        this.totalPieceFinished = totalPieceFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
      
      public double computeSalary() {
        int bonusPieces = totalPieceFinished / 100;
        return totalPieceFinished * ratePerPiece + bonusPieces * 10 * ratePerPiece;
    }
    
      
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + totalPieceFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
        System.out.println("Salary $" + computeSalary());

    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Total Pieces Finished: " + totalPieceFinished + "\n"
                + "Rate Per Piece: " + ratePerPiece + "\n"
                + "Salary: $" + computeSalary();
    }
    
}
