package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class N번째_큰수 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Long> q = new PriorityQueue<Long>(Collections.reverseOrder());
		
		for (int a = 0; a < n; a++) {
			long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			
			for (int b = 0; b < arr.length; b++ ) {
				q.add(arr[b]);
			}
		}
		
		long result = 0;
		for (int a = 0; a < n; a++) {
			result = q.poll();
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
