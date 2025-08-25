package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 쉬운계단수 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr= new int[n+1][10];
		
		
		for (int a = 0;a < 10; a++) {
			arr[1][a] = 1;
		}
		
		
		for (int a = 2; a <=n; a++) {
			for (int b = 0; b < 10; b++) {
				if (b == 0) {
					arr[a][b] = arr[a-1][1] % 1000000000;
				}
				else if (b == 9) {
					arr[a][b] = arr[a-1][8] % 1000000000;
				}
				else {
					arr[a][b] = (arr[a-1][b-1] + arr[a-1][b+1] ) % 1000000000;
				}
			}
		}
		
		long sum = 0;
		for (int a = 1; a < 10; a++) {
			sum = (sum + arr[n][a]) % 1000000000;
		}
		
		System.out.println(sum);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
