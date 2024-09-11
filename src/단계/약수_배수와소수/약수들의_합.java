package 단계.약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수들의_합 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int cnt = Integer.parseInt(br.readLine());
			String text = "";
			if ( cnt == -1 ) break;
			int sum = 0;
			for( int a = 1; a < cnt; a++ ) {
				if (cnt % a == 0) {
					sum += a;
					if ( a == 1 ) {
						text += a;
					}
					else {
						text += " + " + a;	
					}
					
				}
			}
			
			if (sum == cnt) {
				
				text = cnt + " = " + text ;
			}
			else {
				text = cnt + " is NOT perfect.";
			}
			
			System.out.println(text);
		}
		br.close();
	}
}
