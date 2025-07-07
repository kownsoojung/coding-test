package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a01타일 {
	
	public static int n = 0;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		int[] dp = new int[1000001];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		if (n < 3) {
			System.out.println(dp[n]);
			
			return;
		}
		for (int a = 3; a <= 1000000; a++) {
			dp[a] = (dp[a-1] + dp[a-2]) % 15746;
		}
		
		System.out.println(dp[n]);
		bw.flush();
		br.close();
		bw.close();
	}

}
