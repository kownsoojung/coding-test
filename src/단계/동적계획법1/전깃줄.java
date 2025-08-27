package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 전깃줄 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		int[][] arr =new int [n][2];
		
		for (int a = 0; a < n; a++) {
			arr[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		Arrays.sort(arr,  (o1,o2) -> o1[0] - o2[0]);
		
		
		int[] data = new int[100];
		
		data[0] = 1;
		int result  = 0;
		for (int a = 1; a <n ;a++) {
			int num = arr[a][1];
			int max = 0;
			for (int b = 0; b < a; b++) {
				if (arr[b][1] < num ) {
					max = Math.max(max, data[b]);
				}
			}
			
			data[a] = max == 0 ? 1 : max+1;
			result = Math.max(result, max);
		}
		
		System.out.println(n - result -1);
		
		bw.flush();
		br.close();
		bw.close();
	}
    
}
