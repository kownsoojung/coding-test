package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 계단오르기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr =new  int[n+1];
		
		for(int a = 1; a <= n; a++) {
			arr[a] = Integer.parseInt(br.readLine());;
		}
		
		
		int[] result =new  int[n+1];
		result[1] =  arr[1];
		if (n == 1) {
			System.out.println(result[n]);
			return;
		}
		else if (n == 2) {
			result[2] =  arr[2] + result[1] ;
			return;
		}
		
		result[2] =  arr[2] + result[1] ;
		result[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
		
		
		for (int a = 4; a <=n;a++) {
			result[a] = Math.max(result[a-2] + arr[a], result[a-3] + arr[a] + arr[a-1]);
		}
		
		System.out.println(result[n]);
		
		bw.flush();
		br.close();
		bw.close();
	}
}

