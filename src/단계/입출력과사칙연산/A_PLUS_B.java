package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_PLUS_B {
	
	public static void main(String args[]) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String ab = br.readLine();
		
		int a = Integer.parseInt(ab.split(" ")[0]);
	    int b = Integer.parseInt(ab.split(" ")[1]);
	    
	    br.close();
	    
	    System.out.println(a+b);
	}
}
