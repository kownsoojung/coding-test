package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class 균형잡힌세상 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String data = br.readLine();
			
			if (data.equals(".")) break;
			list.add(data);
			
		}
		
		for (String data : list) {
			
			String[] dataList = data.split("");
			Stack<String> stack = new Stack<String>();
			for (String a : dataList) {
				if (a.equals("(") || a.equals("[") ) stack.add(a);
				else if (a.equals("]") || a.equals(")") ) {
					if ( stack.isEmpty() ) {
						stack.push(data);
						break;
					}
					if (a.equals("]") && stack.peek().equals("[") ||
							a.equals(")") && stack.peek().equals("(") ) {
						stack.pop();
					}
					else {
						stack.push(data);
						break;
					}
				}
			}
			
			if (stack.isEmpty()) bw.write("yes\n");
			else bw.write("no\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
