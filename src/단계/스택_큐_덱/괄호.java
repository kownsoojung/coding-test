package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 괄호 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = Integer.parseInt(br.readLine());
		
		for (int a = 0; a < k ; a++) {
			Stack<String> stack = new Stack<String>();
			String[] vps = br.readLine().split("");
			
			for (int b = 0; b < vps.length; b++) {
				if (vps[b].equals("(")) stack.push(vps[b]);
				else {
					if (stack.isEmpty()) {
						stack.push(vps[b]);
						break;
					}
					stack.pop();
				}
			}
			
			if (stack.isEmpty()) bw.write("YES\n");
			else bw.write("NO\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
