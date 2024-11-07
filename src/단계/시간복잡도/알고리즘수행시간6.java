package 단계.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간6 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		long num= Long.parseLong(br.readLine());
		
		long a = num -2;
		long b = num -1;
		long c = num;
		System.out.println((a*b*c) / 6);
		System.out.println(3);
		br.close();
	}
}
