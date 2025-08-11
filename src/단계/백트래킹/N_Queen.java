package 단계.백트래킹;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class N_Queen {
	
	static int answer =0;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println(1);
			return;
		}
		
		int[] data = new int[n];
		for (int a = 0; a < n; a++) {
			data[0] = a;
			makeChess(0, a, 1, data, n);
		}
		
		System.out.println(answer);
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static class XY {
		int x;
		int y;
		
		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void makeChess(int x, int y, int cnt, int[] board, int n) {
		
		if ( cnt == n ) {
			answer += 1;
			return;
		}
		
		
		for (int a =0; a< n; a++) {
			if (isMaybe(x+1, a, board)) {
				board[x+1] = a;
				makeChess(x + 1, 0, cnt+1, board, n);
			}
		}
	}

	private static boolean isMaybe(int x , int y, int[] board) {
		
		for (int a = 0; a < x; a++ ) {
			if (board[a] == y) return false;
			
			if (Math.abs(a - x) ==  Math.abs(board[a] - y)) return false;
			
			
		}
		
		return true;
	}

}

