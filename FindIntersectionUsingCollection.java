package wek3.day2assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingCollection {

	public static void main(String[] args) {

     int[] array1= {3,2,11,4,6,7};
     int[] array2= {1,2,8,4,9,7};
     
     	List<Integer> array1List= new ArrayList<Integer>();
     	
     	
     	for (int integer1 : array1) {
     		for (int integer2 : array2) {
     			
     			if(integer1==integer2) {
     				array1List.add(integer1);
     				
     			}
				
			}
     		
		}
     	System.out.println(array1List);

	}

}
