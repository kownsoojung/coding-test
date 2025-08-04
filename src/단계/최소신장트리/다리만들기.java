package 단계.최소신장트리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 다리만들기 {
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nm[0];
		int m = nm[1];
		
		int[][] data = new int[n][m];
		
		for (int a = 0; a < m; a++) {
			data[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		
		int sm = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < m; b++) {
				if (data[a][b] == 1) {
				}
			}	
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
