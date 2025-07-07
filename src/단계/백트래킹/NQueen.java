package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NQueen {
	
	public static int n;
	public static int[] chess;
	public static int rValue = 0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		chess = new int[n];
		
		dfs(0);
		
		bw.write(rValue + "");
		bw.flush();
		br.close();
		bw.close();
	}

	private static void dfs(int depth) {

		if (n == depth) {
			rValue++;
			
			return;
		}
		
		for (int a = 0; a < n; a ++) {
			chess[depth] = a;
			
			if (isOk(depth)) {
				dfs(depth  + 1);
			}
		}
	}

	private static boolean isOk(int col) {
		
		for (int a = 0; a < col; a ++) {
			if (chess[col] == chess[a] ) return false;
			if (Math.abs(col - a) == Math.abs(chess[col]- chess[a])) return false;
			
		}
		return true;
	}

	

}
