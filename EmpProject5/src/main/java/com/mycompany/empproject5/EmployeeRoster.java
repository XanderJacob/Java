package com.mycompany.empproject5;

import java.util.ArrayList;

public class EmployeeRoster {

    private ArrayList<Employee> empList;
    private int size;

    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public EmployeeRoster(ArrayList<Employee> empList) {
        this.empList = new ArrayList<>();
        this.empList = empList;
        this.size = empList.size();
    }

    public EmployeeRoster(ArrayList<Employee> empList, int size) {
        this.empList = empList;
        this.size = size;
        this.empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public int getSize() {
        return size;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
        this.size = empList.size();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void displayAllEmployee() {
        for (Employee employee : empList) {
            if (employee != null) {
                employee.displayInfo();
                System.out.println("");
            }
        }
    }

    public boolean addEmployee(Employee e) {
        if (empList.size() < size) {
            empList.add(e);
            System.out.println("Employee " + e.getName().getLastName() + " with ID #" + e.getEmpID());
            return true;
        } else {
            System.out.println("Roster is Full, Please Apply to another Company");
            return false;
        }
    }

    public Employee removeEmployee(int id) {
        for (Employee employee : empList) {
            if (employee != null && id == employee.getEmpID()) {
                empList.remove(employee);
                return employee;
            }
        }
        System.out.println("Employee " + id + " not Found");
        return null;
    }

    public void displayEmployeeByType(String type) {
        String displayMessage = "";

        switch (type.toUpperCase().charAt(0)) {
            case 'H' -> displayMessage = "Displaying Hourly Employees: \n";
            case 'C' -> displayMessage = "Displaying Commission Employees: \n";
            case 'B' -> displayMessage = "Displaying Base Plus Commission Employees: \n";
            case 'P' -> displayMessage = "Displaying Piece Worker Employees: \n";
            default -> {
                System.out.println("Unknown employee type: " + type);
                return;
            }
        }
        System.out.println(displayMessage);
        for (Employee employee : empList) {
            if (employee != null) {
                switch (type.toUpperCase().charAt(0)) {
                    case 'H' -> {
                        if (employee instanceof HourlyEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                    }
                    case 'C' -> {
                        if (employee instanceof CommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                    }
                    case 'B' -> {
                        if (employee instanceof BasePlusCommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                    }
                    case 'P' -> {
                        if (employee instanceof PieceWorkerEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }
}
