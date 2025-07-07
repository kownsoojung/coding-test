package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class N과M4 {
	public static int n,m;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder(); 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		n = nm[0];
		m = nm[1];
		
		
		arr = new int[m];
		dps(1, 0);
		
		bw.write(new String(sb));
		bw.flush();
		br.close();
		bw.close();
	}

	private static void dps(int at, int depth) {
		if (depth == m) {
			for (int i : arr) {
				sb.append(i).append(" ");
				
			}
			sb.append("\n");
			return;
		}
		
		for(int a = at; a <= n; a++) {
			arr[depth]= a;
			dps(a, depth+1);
		}
		
	}
}
