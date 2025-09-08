package 단계.동적계획법2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 동전1 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		
		int[] arr  = new int[n+1];
		for (int a = 1; a <= n; a++) {
			arr[a] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[k+1];
		dp[0] = 1;
		
		for (int a = 1; a <=n; a++) {
			for ( int b =arr[a]; b <= k; b++) {
				dp[b] += dp[b - arr[a]];
			}
		}
		
		System.out.println(dp[k]);
		bw.flush();
		br.close();
		bw.close();
	}


}
