package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 구간_합_구하기5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		int[][] arr = new int [n+1][n+1];
		int[][] sumArr = new int [n+1][n+1];
		for (int a = 1; a <= n; a++) {
			String data = "0 " + br.readLine();
			arr[a] = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		
		for (int a = 1; a <=n; a++) {
			for (int b = 1; b <=n; b++) {
				sumArr[a][b] = sumArr[a][b-1] + arr[a][b];
			}
		}
		
		for (int a = 0; a < m; a++) {
			int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int sum = 0;
			for (int i = data[0]; i <= data[2]; i++) {
				sum += (sumArr[i][data[3]] - sumArr[i][data[1] -1]);
			}
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
}
