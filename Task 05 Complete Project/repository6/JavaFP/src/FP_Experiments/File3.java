package FP_Experiments;

import java.io.BufferedReader;
import java.io.FileReader;

public class File3 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/ACER/eclipse-workspace/repository6/repository6/JavaFP/data/Vehicles.txt"));
		r.lines().filter(l-> l.contains("on")).forEach(l -> System.out.println(l));
		r.close();
	}

}
