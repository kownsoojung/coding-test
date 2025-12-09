package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 보석_도둑 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nk[0];
		int k = nk[1];
		
		long[][] nArr= new long[n][2]; 
		
		for (int a = 0; a < n ; a++) {
			nArr[a]  = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		}
		
		Arrays.sort(nArr,(o1, o2) -> Long.compare(o1[0], o2[0]));

		long rtn = 0;
		long[] bag = new long[k];
		for (int a = 0; a < k ; a++) {
			bag[a] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(bag);
		int idx = 0;
		PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a)); 
		
		for (int a = 0; a < k; a++) {
			while (idx < n && nArr[idx][0] <= bag[a] ) {
				pq.add(nArr[idx][1]);
				idx++;
			}
			
			if (!pq.isEmpty()) {
				rtn +=pq.poll();
			}
		}
		
		
		System.out.println(rtn);
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
