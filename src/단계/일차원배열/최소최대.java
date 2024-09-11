package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 최소최대 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt   = Integer.parseInt(br.readLine());
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int min = list[0];
		int max = list[0];
		for (int i : list) {
			if ( i < min ) min = i;
			if ( i > max ) max = i;
		}
		
		bw.write(min + " "+ max);
		
		bw.flush();
		bw.close();
		br.close();
	}
}