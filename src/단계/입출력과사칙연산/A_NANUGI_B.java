package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_NANUGI_B {
public static void main(String args[]) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] ab = br.readLine().split(" ");
		
	    double a = Double.parseDouble(ab[0]);
	    double b = Double.parseDouble(ab[1]);
	    
	    br.close();
	    
	    System.out.println(a/b);
	}
}
