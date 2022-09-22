package wek3.day2assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> inputList= new ArrayList<Integer>();
		
		for (Integer integer : arr) {
			inputList.add(integer);
			}
		System.out.println(inputList);
		for(int i=0; i<inputList.size();i++) {
			for(int j=i+1; j<inputList.size();j++) {
				if(inputList.get(i)==inputList.get(j)) {
				
					System.out.print(inputList.get(i) + " "+ "is duplicate value in array" + ",");
				}
			}
			
		
		
		}

	}

}
