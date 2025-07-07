package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 베르트랑공준 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = 1;
		while (n != 0) {
			n = Integer.parseInt(br.readLine());

			if (n == 0 ) break;
			int max = n*2;
			int rtnVal = 0;
			if (max == 2) bw.write(1 + "\n");
			else {
				for (int a = n+1; a <= max; a++) {
					
					boolean isTrue = true;
					for ( int b = 2; b <= Math.sqrt(a); b++ ) {
						
						if ( a % b == 0 ) {
							isTrue = false;
							break;
						}
					}
					
					if (isTrue) rtnVal++;
				}
				
				bw.write(rtnVal + "\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
