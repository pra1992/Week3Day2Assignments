package wek3.day2assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//Key=Character, Value=Integer
		Map<Integer,String> map= new LinkedHashMap<Integer,String>();
		//to add a value in Map
		
		map.put(100, "Hari");
		map.put(200, "Raja");
		map.put(200, "Haja");
		map.put(200, "Aravind");
		System.out.println(map.get(200));// If we have same Key, the latest value will overwrite in Map
		
	}

}
