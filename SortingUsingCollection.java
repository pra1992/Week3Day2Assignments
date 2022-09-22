package wek3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String>  companyNames= new ArrayList<String>();
		for (String values : input) {
			companyNames.add(values);
		}
    Collections.sort(companyNames);
    Collections.reverse(companyNames);
    System.out.println(companyNames);

}}
