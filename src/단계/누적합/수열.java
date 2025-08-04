package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수열 {
	
	static int max = Integer.MIN_VALUE;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int k = nk[1];
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		dp(0, k, list);
		
		bw.write(max+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	private static void dp(int i, int k, int[] list) {
		
		int sum = 0;
		for (int a = i; a < i + k; a++) {
			sum += list[a];
		}
		
		max = Math.max(max, sum);
		
		if (i+k == list.length) return;
		
		dp(i+1, k, list);
	}
}
