package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 연속합 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long[] result = new long[ n];
		Long max = arr[0];
		result[0] = arr[0];
		
		for (int a = 1; a < arr.length ; a++) {
			result[a] = Math.max(result[a-1] + arr[a], arr[a]);
			max = Math.max(max, result[a]);
		}
		
		System.out.println(max);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
}
