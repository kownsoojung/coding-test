package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());
		int value = 0;
		if ( year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) value = 1;
		
		System.out.println(value);
		
	}	
}
