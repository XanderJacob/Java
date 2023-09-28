package com.mycompany.empproject4;

public class EmployeeRoster {

    private Employee[] empList;
    private int size = 10;
    private int count = 0;

    public EmployeeRoster() {
        empList = new Employee[size];
    }

    public EmployeeRoster(Employee[] empList) {
        this.empList = new Employee[size];
        this.empList = empList;
    }

    public EmployeeRoster(Employee[] empList, int size) {
        this.empList = empList;
        this.size = size;
        this.empList = new Employee[size];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void displayAllEmployees() {
        for (Employee employee : empList) {
            if (employee != null) {
                employee.displayInfo();
                System.out.println("");
            }
        }
    }

    public boolean addEmployee(Employee e) {
        if (count < size) {
            empList[count] = e;
            count++;
            System.out.println("EMPLOYEE " + e.getName().getLastName() + " WITH ID #" + e.getEmpID() + " added\n");
            return true;
        } else {
            System.out.println("Roster is full.");
            return false;
        }
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                Employee removed = empList[i];
                empList[i] = null;
                count--;
                return removed;
            }
        }
        System.out.println("EMPLOYEE #" + id + " NOT FOUND!");
        return null;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster match = new EmployeeRoster();
        for (Employee employee : empList) {
            if (employee != null) {
                String empInfo = employee.getName().toString().toLowerCase();
                String search = keyword.toLowerCase();

                if (empInfo.contains(search) || String.valueOf(employee.getEmpID()).contains(search)) {
                    match.addEmployee(employee);
                }
            }
        }
        return match;
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
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                cnt++;
            }
        }

        return cnt;
    }

    public int countCommissionEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof CommissionEmployee) {
                cnt++;
            }
        }

        return cnt;
    }
    public int countBasePlusCommisionEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                cnt++;
            }
        }

        return cnt;
    }
    
    public void displayEmployeeByType(String type) {
        String displayMessage = "";

        switch (type.toUpperCase().charAt(0)) {
            case 'H':
                displayMessage = "Displaying Hourly Employees: \n";
                break;
            case 'C':
                displayMessage = "Displaying Commission Employees: \n";
                break;
            case 'B':
                displayMessage = "Displaying Base Plus Commission Employees: \n";
                break;
            case 'P':
                displayMessage = "Displaying Piece Worker Employees: \n";
                break;
            default:
                System.out.println("Unknown employee type: " + type);
                return;
        }
System.out.println(displayMessage);

        for (Employee employee : empList) {
            if (employee != null) {
                switch (type.toUpperCase().charAt(0)) {
                    case 'H':
                        if (employee instanceof HourlyEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'C':
                        if (employee instanceof CommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'B':
                        if (employee instanceof BasePlusCommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'P':
                        if (employee instanceof PieceWorkerEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                }
            }
        }
    }
    
    
}
