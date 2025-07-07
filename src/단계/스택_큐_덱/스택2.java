package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class 스택2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int a = 0; a < n ; a++) {
			int[] x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			switch (x[0]) {
				case 1: {
					stack.push(x[1]);
					break;
				}
				case 2: {
					if (stack.isEmpty()) bw.write(-1 + "\n");
					else {
						bw.write(stack.pop()+ "\n");
					}
					break;
				}
				case 3: {
					bw.write(stack.size()+ "\n");
					break;
				}
				case 4: {
					if (stack.isEmpty()) bw.write(1+ "\n");
					else bw.write(0+ "\n");
					break;
				}
				case 5: {
					if (stack.isEmpty()) bw.write(-1+ "\n");
					else bw.write(stack.peek()+ "\n");
					break;
				}
			}
			
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
