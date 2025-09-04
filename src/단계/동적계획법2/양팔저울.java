package 단계.동적계획법2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 양팔저울 {
	
	static boolean[][] wArr;
	static int max;
	static int n;
	static int[] nArr;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int k = Integer.parseInt(br.readLine());
		int[] kArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for(int a = 0; a < n; a++) {
			max += nArr[a];
		}
		
		wArr = new boolean[n+1][max+1];
		
		dp(0, 0);
		
        for (int weight : kArr) {
            if (weight > max) {
                bw.write("N\n");
            } else {
                bw.write(wArr[n][weight] ? "Y\n" : "N\n");
            }
        }
		
		bw.flush();
		br.close();
		bw.close();
	}
	private static void dp(int idx, int w) {
		 if (idx > n || wArr[idx][w]) return;
		 wArr[idx][w] = true;

	        if (idx == n) return;

	        // 1. 추를 안 올림
	        dp(idx+1, w);
	        // 2. 한쪽에 올림
	        dp(idx+1, w + nArr[idx]);
	        // 3. 반대쪽에 올림 (절대값)
	        dp(idx+1, Math.abs(w - nArr[idx]));
	}

}
