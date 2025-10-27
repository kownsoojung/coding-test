package 단계.그리디알고리즘1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 회의실배정 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		
		for (int a= 0 ; a<n ; a++) {
			arr[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return  o1[0]-o2[0];
			}
		    return o1[1]-o2[1];
		});

		int max = arr[0][1];
		
		int sum = 1;
		for (int a = 1; a < n; a++) {
			if (arr[a][0] >= max) {
				sum +=1;
				max = arr[a][1];
			}
		}
		
		bw.write(sum + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
