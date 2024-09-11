package 단계.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 너의평점은 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		double totSum = 0;
		double tot2 = 0;
				
		for ( int a = 0; a < 20; a++) {
			String[] list = br.readLine().split(" ");
			Double jumsu = Double.parseDouble(list[1]); 
			String grade = list[2];
			
			if (grade.equals("P")) continue;

			totSum +=  jumsu * map.get(grade);
			tot2 += jumsu;
		}
		
		double result = totSum / tot2;
		
		System.out.printf("%.6f", result);

		br.close();
	}
}
