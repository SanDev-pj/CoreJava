/*Write a program to accept a String from user and display the length of the string. Also display 
the string in uppercase and lowercase and check whether it is a palindrome or not.*/

package STRING;

import java.util.Scanner;

public class StingAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = scan.nextLine();
		scan.close();
		System.out.println("Given string lenght is" + " " + s.length());
		System.out.println("String in upper case" + " " + s.toUpperCase());
		System.out.println("String in lower case" + " " + s.toLowerCase());
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)){
			System.out.println("Given string is palindrome");
		}
		else{
			System.out.println("Given string is not palindrome");
		}
		

	}

}
