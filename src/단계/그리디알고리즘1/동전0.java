package 단계.그리디알고리즘1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 동전0 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];

		int[] arr = new int[n];
		
		for (int a= n-1; a >= 0; a--) {
			arr[a] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		for (int a= 0; a < n; a++) {
			if (arr[a] > k) {
				continue;
			}
			else if ( arr [a] == k) {
				k = 0;
				cnt +=1;
				break;
			}
			else {
				cnt += (k / arr[a]);
				k = k%arr[a];
				
			}
			
			if (k == 0) break;
			
		}
		
		
		System.out.println(cnt);
		bw.flush();
		br.close();
		bw.close();
	}
}
