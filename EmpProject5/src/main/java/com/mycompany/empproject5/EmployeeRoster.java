package com.mycompany.empproject5;

import java.util.ArrayList;

public class EmployeeRoster {

    private ArrayList<Employee> empList;
    private int count;
    private int size;

    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public EmployeeRoster(ArrayList<Employee> empList) {
        this.empList = new ArrayList<>();
        this.empList = empList;

    }

    public EmployeeRoster(ArrayList<Employee> empList, int size) {
        this.empList = empList;
        this.size = size;
        this.empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public void setCount(int count) {
        this.count = count;
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
    public boolean addEmployee(Employee e){
        if(count < size){
            empList.add(e);
            count++;
            System.out.println("Employee "+ e.getName().getLastName() + "With ID #" + e.getEmpID());
            return true;
        }else{
            System.out.println("Roster is Full, Please Apply to another Company");
            return false;
        }
    }
    public Employee removeEmployee(int id){
        for(Employee employee: empList){
            if(employee!=null && id== employee.getEmpID()){
                empList.remove(employee);
                count--;
                return employee;
            }
        }
        System.out.println("Employee "+ id + "Not Found");
        return null;
    }
     public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster matching = new EmployeeRoster();
        for (Employee employee : empList) {
            if (employee != null) {
                String empInfo = employee.getName().toString().toLowerCase();
                String search = keyword.toLowerCase();

                if (empInfo.contains(search) || String.valueOf(employee.getEmpID()).contains(search)) {
                    matching.addEmployee(employee);
                }
            }
        }
        return matching;
    }
     public int countHourEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                cnt++;
            }
        }
        return cnt;
    }

    public int countPieceWorkerEmployee() {
        int num = 0;
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                num++;
            }
        }

        return num;
    }

    public int countCommissionEmployee() {
        int num = 0;
        for (Employee employee : empList) {
            if (employee instanceof CommissionEmployee) {
                num++;
            }
        }

        return num;
    }
    
    public int countBasePlusCommisionEmployee() {
        int num = 0;
        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                num++;
            }
        }

        return num;
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
