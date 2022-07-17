package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment03 {
	public static void main(String[] args) {
	  String[] n1 = {"Toyota", "BMW", "Honda","Suzuki","Volvo"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(String String:n2) {
			System.out.println(String);
		}	
	}
}


