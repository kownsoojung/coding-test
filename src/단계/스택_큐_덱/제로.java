package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 제로 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int a = 0; a < k ; a++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x == 0) {
				stack.pop();
			}
			else stack.push(x);
		}
		
		int sum = 0;
		for (Integer a : stack) {
			sum += a;
		}
		
		bw.write(sum + "");
		bw.flush();
		br.close();
		bw.close();
	}
}