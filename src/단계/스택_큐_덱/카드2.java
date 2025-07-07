package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> nList = new LinkedList<Integer>();
		
		for (int a= 1; a <= n; a++) {
			nList.add(a);
		}
		
		while (nList.size() != 1) {
			nList.poll();
			
			if (nList.size() != 1) {
				int a = nList.poll();
				nList.add(a);
			}
			else {
				break;
			}
			
		}
		bw.write(nList.peek() + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
