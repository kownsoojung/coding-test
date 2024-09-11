package 단계.약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 약수구하기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String text = br.readLine();
		int[] temp = Arrays.stream(text.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int cnt = 0;
		int value = 0;
		
		for ( int a = 1; a <= temp[0]; a++ ) {
			if (temp[0] % a == 0 ) {
				cnt++;
				if ( cnt == temp[1] ) {
					value = a;
					break;
				}
			}
		}
		
		bw.write(value + "");
		
		bw.flush();
		br.close();
		bw.close();
	}	
}
