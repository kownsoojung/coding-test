package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험성적 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int h = Integer.parseInt(br.readLine());
		String value = "F";
		br.close();
		if ( h >= 90 ) value = "A";
		else if ( h >= 80) value = "B";
		else if ( h >= 70) value = "C";
		else if ( h >= 60) value = "D";
		
		System.out.println(value);
		
	}	
}
