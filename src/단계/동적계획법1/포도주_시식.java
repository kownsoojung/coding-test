package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 포도주_시식 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		int[] arr =new int[n+1];
		
		for (int a = 1; a <= n; a++) {
			arr[a] =  Integer.parseInt(br.readLine());
		}
		
		if (n == 1) {
			System.out.println(arr[1]);
			return;
		}
		else if (n==2) {
			System.out.println(arr[1]+ arr[2]);
			return;
		}
		
		long[] data =   new long[n+1];
		data[1] = arr[1];
		data[2] = arr[1] + arr[2];
		data[3] = Math.max(data[1] + arr[3], arr[2] + arr[3]);
		data[3] = Math.max(data[3], data[2]);
		
		if (n == 3) {
			System.out.println(data[3]);
			return;
		}
		
		for (int a = 4; a <= n; a ++) {
			data[a] = Math.max(data[a-2] + arr[a], data[a-3] + arr[a-1] + arr[a]);
			data[a] = Math.max(data[a], data[a-1]);
		}
		
		
		long result =Math.max(data[n], data[n-1]);
		System.out.println(result);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
