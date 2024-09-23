package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 삼각형과_세_변 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		
		while (true) {
			String text = br.readLine();
			
			if (text.equals("0 0 0")) break;
			
			int a= Integer.parseInt(text.split(" ")[0]);
			int b= Integer.parseInt(text.split(" ")[1]);
			int c= Integer.parseInt(text.split(" ")[2]);
			int[] list = {a, b, c};
			Arrays.sort(list);
			if ( list[2] >= list[1] + list[0]) System.out.println("Invalid");
			else {
				if ( a == b && b == c ) System.out.println("Equilateral");
				else if ( a == b || b == c || a == c ) System.out.println("Isosceles");
				else System.out.println("Scalene");		
			}
		}
		
		br.close();
	}
}
