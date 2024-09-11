package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 두수비교하기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String[] ab = br.readLine().split(" ");
		br.close();
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
				
		if (a < b ) System.out.println("<");
		else if (a > b) System.out.println(">");
		else System.out.println("==");
	}
}
