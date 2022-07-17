package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
	
	public static void main(String[] args) {
	  String[] n1 = {"Toyota", "BMW", "Honda","Suzuki","Volvo"};
	  
		List<String> n2 = Arrays.asList(n1);
		n2.forEach(String -> System.out.println(String));
	}
	
}



