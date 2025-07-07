package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class 도키도키간식드리미 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int[] nList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int now = 1;
		
		for (int i = 0; i < a; i++) {
			if (now == nList[i]) {
				now++;
				while (!stack.isEmpty()) {
					if (stack.peek().equals(now)) {
						stack.pop();
						now++;
					}
					else {
						break;
					}
				}
			}
			else {
				stack.push(nList[i]);
			}
		}
		
		
		if (stack.isEmpty()) bw.write("Nice");
		else bw.write("Sad");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
