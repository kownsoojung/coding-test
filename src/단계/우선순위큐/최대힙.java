package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최대힙 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (int a = 0; a < n ; a++) {
			int data  = Integer.parseInt(br.readLine());
			if (data == 0) {
				if (pQ.isEmpty()) bw.write(0 + "\n");
				else {
					bw.write(pQ.poll() + "\n");
				}
			}
			else {
				pQ.add(data);
			}
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
