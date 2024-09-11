package 단계.약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 배수와약수 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			if ( list[0] == 0 && list[1] == 0 ) break;
			if (list[0] > list[1]) {
				if (list[0] % list[1] == 0) bw.write("multiple\n");
				else bw.write("neither\n");
			}
			else {
				if (list[1] % list[0] == 0) bw.write("factor\n");
				else bw.write("neither\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
