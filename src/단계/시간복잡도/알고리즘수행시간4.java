package 단계.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간4 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		long a= Long.parseLong(br.readLine());
		
		
		System.out.println(a*a*a);
		System.out.println(3);
		br.close();
	}
}
