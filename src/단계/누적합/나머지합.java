package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 나머지합 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		String sArr = "0 " + br.readLine();
		int[]  arr =  Arrays.stream(sArr.split(" ")).mapToInt(Integer::parseInt).toArray();
		long[] data = new long[arr.length];
		int[] cnt = new int[m];
		
		long sum = 0;
		
		for (int a = 1; a < arr.length; a++ ) {
			data[a] = data[a-1] + arr[a];
			
			cnt[(int) (data[a] % m)]++;
		}
		
		for (int a = 0; a < m; a++ ) {
			if (cnt[a] > 1 ) {
				sum +=  (long) cnt[a] * (cnt[a]-1) / 2;
			}
		}
		
		sum += cnt[0];
		
		bw.write(sum + "");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
