package OOPS;

public class StudentDetails {
    public static int count;
    private int id;
    private String name;
    private String address;

    StudentDetails(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        count++;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Address: "+this.address);
    }

}
