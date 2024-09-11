package 단계.약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 소수찾기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int value = 0;
		
		for (int i : list) {
			if (i <= 1) continue;
			
			boolean isTrue = true;
			for ( int a = 2; a < i; a++) {
				if (i % a == 0 ) {
					isTrue = false;
					break;
				}
			}
			
			if( isTrue ) value++;
		}
		
		bw.write(value + "");
		bw.flush();
		br.close();
	}
}
