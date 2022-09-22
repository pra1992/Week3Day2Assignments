package wek3.day2assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "amazon india";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
			
		}
  System.out.println(map);
	}

}
