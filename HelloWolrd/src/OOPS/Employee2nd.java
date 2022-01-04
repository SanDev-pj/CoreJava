package OOPS;

public class Employee2nd {
    private int id;
    private String name;
    private int salary;

    Employee2nd(int id,String name){
        this.id=id;
        this.name=name;
        this.salary=20000;
    }
    Employee2nd(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void display(){
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }
}
