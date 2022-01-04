package COLLECTION;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
    int empno;
    private String ename;
    private String job;

    public Employee(int empno, String ename, String job) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

    public void showInfo() {
        System.out.println("Emp No: " + this.empno);
        System.out.println("Emp Name: " + this.ename);
        System.out.println("Job: " + this.job);
    }
}

class EmployeeContainer {
    private HashSet<Employee> empSet = new HashSet();

    public void addEmployee(Employee emp) {
        if (empSet.isEmpty()) {
            empSet.add(emp);
        } else {
            if (empSet.stream().anyMatch(s -> s.empno == emp.empno)) {
                System.out.println("Employee already exists.");
            } else {
                empSet.add(emp);
                System.out.println("Employee Added successfully");
            }
        }

    }

    public void deleteEmployee(int empNo) {
        if (empSet.isEmpty()) {
            System.out.println("Employee list is empty.");
        } else {
            boolean emp = empSet.stream().anyMatch(s -> s.empno == empNo);
            if (emp) {
                empSet.removeIf(s -> s.empno == empNo);
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    public void viewEmployee(int empno) {
        if (empSet.isEmpty()) {
            System.out.println("Employee list is empty.");
        } else {
            boolean emp = empSet.stream().anyMatch(s -> s.empno == empno);
            if (emp) {
            empSet.stream().filter(s -> s.empno == empno).forEach(s->s.showInfo());
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    public void viewEmployees() {
        if (empSet.isEmpty()) {
            System.out.println("Employee list is empty.");
        }
        else {
            empSet.stream().forEach(s -> s.showInfo());
        }
    }

    public static void main(String[] args) {
        Scanner readVal = new Scanner(System.in);
        EmployeeContainer empService = new EmployeeContainer();
        while (true) {

            System.out.println("\n\t\t\t<====================== Employee Operations =========================>");
            System.out.printf(
                    "\n\n1.Add Employee\t\t2.Show Employee Details\t\t3.Show Total Employee\t\t4.Delete Employee\t\t5.Exit");
            System.out.printf("\n\n@ Enter Your Choice = ");
            int choice = readVal.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("\n@ Enter Employee Employee Id => ");
                    int empno = readVal.nextInt();
                    readVal.nextLine();
                    System.out.printf("\n@ Enter Employee Name => ");
                    String name = readVal.nextLine();
                    System.out.printf("\n@ Enter Employee Job Description => ");
                    String jobDesc = readVal.nextLine();
                    empService.addEmployee(new Employee(empno, name, jobDesc));
                    break;
                case 2:
                    System.out.printf("\n@ Enter Employee Employee Id Whose Detail You Want to See => ");
                    int employeeNo = readVal.nextInt();
                    empService.viewEmployee(employeeNo);
                    break;
                case 3:
                    empService.viewEmployees();
                    break;
                case 4:
                    System.out.printf("\n@ Enter Employee Employee Id Whose Detail You Want to Delete => ");
                    int empNo = readVal.nextInt();
                    empService.deleteEmployee(empNo);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\t\t\t\tWrong Choice Selection ! Please Select Again....");
                    break;
            }
            if (choice == 5) {
                System.out.println("\n\t\t\t\t\t*************** Terminating Application **************");
                break;
            }

        }


    }
}
