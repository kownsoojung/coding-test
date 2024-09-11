package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사분면_고르기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int value = 0; 
		br.close();
		if ( a > 0 && b > 0 ) value = 1;
		else if ( a < 0 && b > 0 ) value = 2;
		else if ( a < 0 && b < 0 ) value = 3;
		else if ( a > 0 && b < 0 ) value = 4;
		
		System.out.println(value);
		
	}	
}
