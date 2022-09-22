package wek3.day2assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStringUsingCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textSplitted=text.split("\\ ");
		Set<String> textWithoutDuplicates= new LinkedHashSet<String>();
		for (String string : textSplitted) {
			
			textWithoutDuplicates.add(string);
		}
     String Output= " ";
     
     for (String string : textWithoutDuplicates) {
    	 Output= Output+string+ " ";
    
    	
	}
     
     System.out.print(Output + " ");
	 
	}

}
