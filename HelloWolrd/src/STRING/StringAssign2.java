/*  Write a program to accept the string from the user and count the number of vowels and
consonants in the given string? */

package STRING;

import java.util.Scanner;

public class StringAssign2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scan.nextLine();
		scan.close();
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0;i<s.length();i++){
			s = s.toLowerCase();
			if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' ||s.charAt(i)== 'o' ||s.charAt(i)== 'u'){
				vowels +=1;
			}
			else{
				consonants +=1;
			}
		}
		System.out.println("Count of vowels:" + " " + vowels);
		System.out.println("Count of consonants:" + " " + consonants);
	}

}
