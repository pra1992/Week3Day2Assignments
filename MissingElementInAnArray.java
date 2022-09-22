package wek3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		
		
		List<Integer> intList= new ArrayList<Integer>();
		for (int integer : arr) {
			intList.add(integer);
			
		}
		Collections.sort(intList);
		System.out.print(intList);
		
	for (Integer integer1 : intList) {
		if(intList.get(integer1-1) != integer1) {
			System.out.println(integer1-1);
			break;
		}
		
	}
			
	

}}
