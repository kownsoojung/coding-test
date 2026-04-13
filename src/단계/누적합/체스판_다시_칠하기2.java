package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 체스판_다시_칠하기2 {
	
	static int n, m, k;
	static String[][] board;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nmk  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		n = nmk[0];
		m = nmk[1];
		k = nmk[2];
		
		board = new String[n][m];
		
		for (int a = 0; a < n; a++ ) {
			board[a] = br.readLine().split("");
		}
        
		
		int result = Math.min(getMinCost("B"), getMinCost("W"));

        System.out.println(result);
    }

    private static int getMinCost(String startColor) {
        int[][] prefixSum = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = 0;
                // 현재 칸이 올바른 색상인지 확인
                String expectedColor;
                if ((i + j) % 2 == 0) {
                    expectedColor = startColor;
                } else {
                    expectedColor = (startColor == "B") ? "W" : "B";
                }

                if (board[i][j].equals(expectedColor)) {
                    value = 1;
                }

                // 2차원 누적합 계산
                prefixSum[i + 1][j + 1] = prefixSum[i][j + 1] + prefixSum[i + 1][j] - prefixSum[i][j] + value;
            }
        }

        int min = Integer.MAX_VALUE;
        // K x K 구간합 계산
        for (int i = k; i <= n; i++) {
            for (int j = k; j <= m; j++) {
                int count = prefixSum[i][j] - prefixSum[i - k][j] - prefixSum[i][j - k] + prefixSum[i - k][j - k];
                min = Math.min(min, count);
            }
        }
        return min;
    }
}
