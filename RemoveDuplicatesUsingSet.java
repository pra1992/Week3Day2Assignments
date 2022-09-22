package wek3.day2assignments;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Paypal India";
	char[] input1=	input.toCharArray();
	 Set<Character>  charSet= new LinkedHashSet<Character>();
	 for (char character : input1) {
		 if( character != ' ') {
			 charSet.add (character);
		 }
		
		
	}
	 String output= " ";
	 for (Character character : charSet) {
		 output= output+character;
		
	}
	 
	 System.out.print(output); 
	 
	}}


