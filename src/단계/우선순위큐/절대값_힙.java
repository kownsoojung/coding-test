package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class 절대값_힙 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> mQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		
		
		for (int a= 0 ; a<n ; a++) {
			int x =  Integer.parseInt(br.readLine());
			
			if ( x == 0 ) {
				boolean isPQ = pQ.isEmpty();
				boolean isMQ = mQ.isEmpty();
				if (isPQ && isMQ) bw.write(0 + "\n");
				else if (isPQ && !isMQ){
					bw.write(mQ.poll() + "\n");
				}
				else if (!isPQ && isMQ) {
					bw.write(pQ.poll() + "\n");
				}
				else {
					int p = Math.abs(pQ.peek());
					int m = Math.abs(mQ.peek());
					
					if (p < m ) {
						bw.write(pQ.poll() + "\n");
					}
					else {
						bw.write(mQ.poll() + "\n");
					}
				}
			}
			else if (x > 0){
				pQ.add(x);
			}
			else {
				mQ.add(x);
			}
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
