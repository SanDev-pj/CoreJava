package EXCEPTION;

public class Employee {
    private int empNumber;
    private String name;
    private float exp;

    public Employee(int empNumber, String name, float exp){
            if(exp >2.5 && exp < 3.6){
                this.empNumber = empNumber;
                this.name = name;
                this.exp = exp;
            }
            else {
                throw new IllegalArgumentException();
            }
    }

    public static void main(String[] args) {
        try {
            Employee emp=new Employee(1,"Sandeep",3);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
