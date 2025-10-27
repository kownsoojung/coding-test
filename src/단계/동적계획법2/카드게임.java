package 단계.동적계획법2;

import java.io.*;
import java.util.*;

public class 카드게임 {

    public static void main(String args[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int a = 0; a < t; a++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" "))
                              .mapToInt(Integer::parseInt).toArray();

            int[][] dp = new int[n][n];

            // 길이 1 초기화
            for (int i = 0; i < n; i++) dp[i][i] = arr[i];

            // 구간 길이 2 이상
            for (int len = 2; len <= n; len++) {
                for (int l = 0; l + len - 1 < n; l++) {
                    int r = l + len - 1;
                    dp[l][r] = Math.max(arr[l] - dp[l+1][r], arr[r] - dp[l][r-1]);
                }
            }

            int sum = Arrays.stream(arr).sum();
            int diff = dp[0][n-1]; // 근우 점수 - 명우 점수
            int geunwoo = (sum + diff) / 2;

            bw.write(geunwoo + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
