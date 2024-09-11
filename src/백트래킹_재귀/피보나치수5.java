package 백트래킹_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int pre = 0;
		int next = 1;
		int sum = 0;
		if (a == 0) {
			System.out.println(sum);
		}
		else if( a==1) { 
			System.out.println(1);
		}
		else {
			
			for ( int i = 2; i <= a; i++ ) {
				sum = pre + next;
				pre = next;
				next = sum;
			}
			
			System.out.println(sum);
		}
		
		
	}
}
