package 단계.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 다리놓기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int dp[][] = new int[30][30];
		
		for (int a = 0; a < 30; a++) {
			dp[a][a] = 1;
			dp[a][0] = 1;
		}
		
		for (int a = 2; a < 30; a++) {
			for (int b = 1; b <30; b++) {
				dp[a][b] = dp[a -1][b -1] + dp[a -1][b];
			}
		}
		
		
		for (int a = 0; a < cnt; a++) {
			int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int n = nm[0];
			int m = nm[1];
			
			bw.write(dp[m][n] + "\n");
			
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
