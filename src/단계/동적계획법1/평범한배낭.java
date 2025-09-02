package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 평범한배낭 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		int[][] arr =new  int[n+1][2];
		
		for(int a = 1; a <= n; a++) {
			arr[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		int[][]data = new int[n+1][k+1];
		
		int max = 0;
		
		for (int a = 1; a <= n; a++) { // 총 가방에 들어갈 개수
			for (int b = 1; b <= k; b++) { // 키로수 
				if (arr[a][0] > b ) { // 키로수보다 가방의 키로수가 넘칠 경우 이전 배열의 데이터를 넣기
					data[a][b] = data[a-1][b];
				}
				else {
					data[a][b] = Math.max(data[a-1][b], data[a-1][b - arr[a][0]] + arr[a][1]);
				}
				
				max = Math.max(data[a][b], max);
			}
		}
		
		
		System.out.println(max);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
