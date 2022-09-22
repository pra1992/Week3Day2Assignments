package wek3.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};//2,3,4,6,7,11
		
		Set<Integer>  dataSet= new TreeSet<Integer>();
		
		for (int integer : data) {
			dataSet.add(integer);
			
		}
		System.out.println(dataSet);
		List<Integer> secondElementFromLast= new ArrayList<Integer>(dataSet);
		System.out.println(secondElementFromLast.get(secondElementFromLast.size()-2));
		
	
		

	}
}
