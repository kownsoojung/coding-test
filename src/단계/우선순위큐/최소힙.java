package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class 최소힙 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int a = 0; a < n; a++) {
			int data = Integer.parseInt(br.readLine());
			if (data == 0) {
				if (q.isEmpty()) bw.write(0 + "\n");
				else {
					bw.write(q.poll() + "\n");
				}
			}
			else {
				q.add(data);
			}
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
