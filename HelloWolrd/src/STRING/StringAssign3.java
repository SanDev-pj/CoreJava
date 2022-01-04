/* Write a program to find the
1. No. of letters
2. No. of digits
3. No. of whitespaces in the following input.
Input: �I am in Bangalore my house number is 6 and my phone no. 9632133889� */

package STRING;

public class StringAssign3 {

	public static void main(String[] args) {
		String s = "I am in Bangalore my house number is 6 and my phone no. 9632133889";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		int space = 0;
		int letter =0;
		int dig = 0;
		
		for(int i=0; i<ch.length;i++){
			
			if(ch[i]>= '0' && ch[i]<= '9'){
				dig += 1;
			}
			else if(ch[i]>= 'a' && ch[i]<= 'z'){
				letter +=1;
			}
			else if (ch[i] == ' '){
				space +=1;
			}
		}
		
		System.out.println("No of digits" + " " + dig);
		System.out.println("No of letter" + " " + letter);
		System.out.println("No of whitespace" + " " + space);
		

	}

}
