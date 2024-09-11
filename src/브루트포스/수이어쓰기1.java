package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기1 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int listCnt = 1;
		int length  = 10;
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if ( length == i ) {
				listCnt++;
				length = length *10;
			}
			
			sum +=listCnt;
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
