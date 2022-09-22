package wek3.day2assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccuranceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> map= new TreeMap<Integer,Integer>();
		
	for (int i : input) {
		
		if(map.containsKey(i)) {
			map.put(i, map.get(i)+1);
		}
		else {
			map.put(i, 1);
		}
		
		
	}
		System.out.println(map);
		

}}
