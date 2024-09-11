package 단계.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 합 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int rValue = 0;
		br.close();
		
		for (int i=1; i <= a ; i++) {
			rValue += i;
		}
		
		System.out.println(rValue);
		
	}	
}
