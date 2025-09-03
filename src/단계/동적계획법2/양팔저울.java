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
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int k = Integer.parseInt(br.readLine());
		int[] kArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[][] wArr = new int[n][n];
		boolean[] isTrue = new boolean[400001];
		wArr[0] = nArr;
		
		 Set<Integer> sums = new HashSet<>();
		int max = 0;
		for(int a = 0; a < n; a++) {
			isTrue[nArr[a]] = true;
		}
		
		
		for (int mask = 1; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { // i번째 원소가 포함되면
                    sum += nArr[i];
                }
            }
            sums.add(sum);
            max = sum;
            
            isTrue[sum] = true;
        }
		
		
		int[] result = sums.stream().mapToInt(Integer::intValue).toArray();
		for (int i = 0; i < k; i++) { // 총 가방에 들어갈 개수
			
			isYn(kArr[i], result, isTrue, max);
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}


	private static void isYn(int i, int[] result, boolean[] isTrue, int max) {
		
		
		if (isTrue[i]) {
			System.out.println("Y");
			return;
		}
		for (int a = 0; a < result.length; a++) {
			if (i == 1 && result[a] <= 2 ) {
				System.out.println("Y");
				return;
			}
			
			if (isTrue[i + result[a]] == true && max - result[a] >= i) {
				System.out.println("Y");
				return;
			}
		}
		
		
		System.out.println("N");
		return;
	}
}
