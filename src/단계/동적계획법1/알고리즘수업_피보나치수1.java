package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알고리즘수업_피보나치수1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		
		
		int rtn1 = fib(n);
		int rtn2 = fibonacci(n);
		
		bw.write(rtn1 + " " + (n -2) ) ;
		bw.flush();
		br.close();
		bw.close();
	}


	private static int fib(int n) {
		if (n == 1 || n == 2 )return 1;
		else return (fib(n-1) + fib(n -2));
	}
	
	private static int fibonacci(int n) {
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for (int a = 2; a < n; a++) {
			arr[a] = arr[a -2 ] + arr[a -1];
		}
		return arr[n-1];
	}
}
