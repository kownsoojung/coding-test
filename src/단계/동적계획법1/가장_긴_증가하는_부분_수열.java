package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 가장_긴_증가하는_부분_수열 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] data = new int[n];
		data[0] = 1;
		int max = data[0];
		for (int a = 1; a < n; a++) {
			data[a] = lis(a, arr, data);
			max = Math.max(max, data[a]);
		}
		
		System.out.println(max);
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static int lis(int a, int[] arr, int[] data) {
		int num = arr[a];
		int max = 0;
		
		for ( int i = 0; i < a; i++ ) {
			if ( num > arr[i] ) {
				max = Math.max(max, data[i]);
			}
		}
		if (max == 0) return 1;
		return max +1;
				
	}

}
