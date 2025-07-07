package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 덱2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		for (int a = 0; a < n ; a++) {
			int[] x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			switch (x[0]) {
				case 1 : {
					deque.addFirst(x[1]);
					break;
				}
				case 2 : {
					deque.addLast(x[1]);
					break;
				}
				case 3 : {
					if (deque.isEmpty()) bw.write("-1" + "\n");
					else bw.write(deque.pollFirst() + "\n");
					break;
				}
				case 4 : {
					if (deque.isEmpty()) bw.write("-1" + "\n");
					else bw.write(deque.pollLast() + "\n");
					break;
				}
				case 5 : {
					bw.write(deque.size() + "\n");
					break;
				}
				case 6 : {
					if (deque.isEmpty()) bw.write("1" + "\n");
					else bw.write("0" + "\n");
					break;
				}
				case 7 : {
					if (deque.isEmpty()) bw.write("-1" + "\n");
					else bw.write(deque.peekFirst() + "\n");
					break;
				}
				case 8 : {
					if (deque.isEmpty()) bw.write("-1" + "\n");
					else bw.write(deque.peekLast() + "\n");
					break;
				}
				
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
