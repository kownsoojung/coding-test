package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 골드바흐_파티션 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t = Integer.parseInt(br.readLine());
		boolean[] decimalList = new boolean[1000001];
		decimalList[0] = false;
		decimalList[1] = false;
		decimalList[2] = true;
		for (int a = 3; a <= 1000000; a++) {
			boolean isTrue = true;
			for (int b = 2; b <= Math.sqrt(a); b++) {
				if ( a % b == 0 ) {
					isTrue = false;
					break;
				}
			}	
			
			if (isTrue) decimalList[a] = true;
			else decimalList[a] = false;
		}
		
		
		
		for (int a = 0; a < t; a++) {
			int n = Integer.parseInt(br.readLine());
			
			int cnt = 0;
			
			int min = 0; 
			int max = n;
			for (int b = 0; b <= n /2 ; b++) {
				if (decimalList[min] == true && decimalList[max] == true) cnt++;
				
				min++; max--;
			}
			
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
