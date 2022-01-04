package EXCEPTION;

import java.util.Scanner;

public interface EmployeeHr {
    public void printDET();
    public void calculateHRA();
}
 class EmployeeHra implements EmployeeHr {

    int empId;
    String empName;
    String designation;
    double basic;
    double hra;

    EmployeeHra(int empId, String empName, String designation, double basic, double hra) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        this.hra = hra;
    }

    @Override
    public void printDET() {
        System.out.println("The employee Detail is");
        System.out.println("----------------------------------------------------");
        System.out.println("Employee Id :" + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee Designation: " + this.designation);
        System.out.println("Employee basic: " + this.basic);
    }

    @Override
    public void calculateHRA() {
        double hraBasedonBasic = this.hra / 100 * this.basic;
        System.out.println("hra based on salary "+hraBasedonBasic);
    }
}
class EmployeeHraMain {

    public static void main(String[] args) {
        final double MANAGER_HRA = 10;
        final double OFFICER_HRA = 12;
        final double CLERK_HRA = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Employee ID: ");
        int empId = scan.nextInt();
        System.out.println("Enter the Employee Name: ");
        String empName = scan.next();
        System.out.println("Enter the Employee's Designation: ");
        String designation = scan.next();
        System.out.println("Enter the basic: ");
        double basic = scan.nextDouble();
        try {
            if(basic<500)
            {
                throw new LowSalException("Basic is less than 500");
            }
            else
            {
                System.out.println();

                if (designation.equalsIgnoreCase("manager")) {
                    EmployeeHra obj = new EmployeeHra(empId, empName, designation, basic, MANAGER_HRA);
                    obj.printDET();
                    obj.calculateHRA();
                } else if (designation.equalsIgnoreCase("officer")) {
                    EmployeeHra obj = new EmployeeHra(empId, empName, designation, basic, OFFICER_HRA);
                    obj.printDET();
                    obj.calculateHRA();
                } else if (designation.equalsIgnoreCase("clerk")) {
                    EmployeeHra obj = new EmployeeHra(empId, empName, designation, basic, CLERK_HRA);
                    obj.printDET();
                    obj.calculateHRA();
                }
            }
        }
        catch(LowSalException exe){
            System.out.println(exe.getMessage());
        }
        finally {
            scan.close();
        }
    }
}
class LowSalException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public LowSalException(String message) {
        super(message);
    }
}
