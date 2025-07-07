package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 풍선터트리기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sbd = new StringBuilder();

		
		int n = Integer.parseInt(br.readLine());

		Deque<int[]> deque = new ArrayDeque<>();
		int[] x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		sbd.append("1 ");
		for (int a = 1; a < n ; a++) {
			deque.add(new int[] {x[a], a+1});
		}
		
		int move = x[0];
		for (int a = 1; a < n ; a++) {
			
			if (move < 0 ) {
				for ( int c = 1; c < -move; c ++ ) {
					deque.offerFirst(deque.pollLast());
				}
				
				int[] move_arr = deque.pollLast();
                move = move_arr[0];
                sbd.append( move_arr[1]+" ");
			}
			else {
				for ( int c = 1; c < move; c ++ ) {
					deque.offer(deque.poll());
				}
				
				int[] move_arr = deque.poll();
                move = move_arr[0];
                sbd.append( move_arr[1]+" ");
			}
			
		}
		
		
		bw.write(new String(sbd) );
		bw.flush();
		br.close();
		bw.close();
	}
}
