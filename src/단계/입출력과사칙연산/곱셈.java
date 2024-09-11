package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈 {
	public static void main(String args[]) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int a = Integer.parseInt(br.readLine());
	    String[] b = br.readLine().split("");
	    
	    br.close();
	    
	    String value1 = Integer.toString(a * Integer.parseInt(b[2]));
	    String value2 = Integer.toString(a * Integer.parseInt(b[1]));
	    String value3 = Integer.toString(a * Integer.parseInt(b[0]));
	    int value4 = Integer.parseInt(value1) + Integer.parseInt(value2 + "0") + Integer.parseInt(value3 + "00");
	    
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	    System.out.println(value4);
	    
	}
}

