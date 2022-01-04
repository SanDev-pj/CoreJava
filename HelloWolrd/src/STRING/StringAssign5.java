/* Write a program to create the class with
firstName
middleName
lastName
When you call the display() it should display full name with �-� separator.
Example:
firstName =�raj�
middleName=�kumar�
lastName=�k�
output:� raj-kumar-k�*/

package STRING;

public class StringAssign5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.firstName ="raj";
		stu.middleName = "kumar";
		stu.lastName = "k";
		stu.display(stu.firstName, stu.middleName, stu.lastName);		
		}
	}

class Student {
	String firstName;
	String middleName;
	String lastName ;
	 
	void display(String fname, String mname,String lname){
		System.out.println(fname + "-" + mname + "-" + lname);
	}
	
	
	
}
