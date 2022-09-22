package wek3.day2assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class FindMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input= "abbaba";
		char[] inputArray=input.toCharArray();
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
	for (char c : inputArray) {
	  if(map.containsKey(c)) {
		  map.put(c, map.get(c)+1);
	  }
	  else {
		  map.put(c, 1);
	  }
	}	
		System.out.println(map);
	Set<java.util.Map.Entry<Character, Integer>> entrySet = map.entrySet();
	
	char MaxDuplicateKey=0;
	int  MaxDuplicatedValue=0;
	for (java.util.Map.Entry<Character, Integer> entry : entrySet) {
		if(entry.getValue()>MaxDuplicatedValue) {
			MaxDuplicateKey=entry.getKey();
			MaxDuplicatedValue= entry.getValue();
		}
		
	}
	
	System.out.println(MaxDuplicateKey);	
		
	}}


