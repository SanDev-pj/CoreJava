/*Write a program to search for a string in a given group of strings?
String s =�miani,lakshman,java,malli,narayana�;
searchString sc=�narayana�
output : found at position 4 */

package STRING;

public class StringAssign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="miani,lakshman,java,malli,narayana";
		String sc = "malli";
		String[] array = s.split(",");
		for(int i=0;i<array.length;i++){
			
	       if(array[i].equals(sc)){
	    	   System.out.println("found at position" + " " + i);
	       }
	}
	}
}

