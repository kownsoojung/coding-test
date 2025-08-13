package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 스타트와_링크 {
	
	private static long min = Long.MAX_VALUE;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		int[][] board = new int[n][n];
		for (int a = 0; a < n;a ++) {
			board[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		int[] star = new int[n/2];
		int[] link = new int[n/2];
		
		back(1,1,0,star, link, board);
		
		System.out.println((int)min);
		bw.flush();
		br.close();
		bw.close();
	}

	private static void back(int i, int s, int l, int[] star, int[] link, int[][] board) {
		int cnt = board.length /2 ;
		if (s == cnt && l == cnt ) {
			diffrent(star, link, board);
			return;
		}
		
		if (s < cnt) {
			star[s] = i;
			back(i+1,s+1,l,star, link, board);
			star[s] = 0;	
		}
		if (l< cnt) {
			link[l] = i;
			back(i+1,s,l+1,star, link, board);
			link[l] = 0;	
		}
	}

	private static void diffrent(int[] star, int[] link, int[][] board) {
		
		long s = 0;
		
		long l = 0;
		
		for (int a = 0; a < star.length; a++) {
			for (int b = 0; b < star.length; b++) {
				if (a == b) continue;
				
				s = s + board[star[a]][star[b]];
				l = l + board[link[a]][link[b]];
			}
		}
		
		long data = Math.abs(s - l);
		
		min = Math.min(data, min);
	}
}
