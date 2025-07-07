package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 큐2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int real = 0;
		for (int i = 0; i < n; i++) {
			String[] data = br.readLine().split(" ");
			
			
			switch (data[0]) {
				case "push": {
					int x = Integer.parseInt(data[1]);
					real = x;
					queue.add(x);
					break;
				}
				case "pop": {
					
					if (queue.isEmpty()) bw.write("-1" + "\n");
					else bw.write(queue.poll()+ "\n");
					
					break;
				}
				case "size": {
					bw.write(queue.size() + "\n");
					break;
				}
				case "empty": {
					if (queue.isEmpty()) bw.write("1" + "\n");
					else bw.write("0"+ "\n");
					break;
				}
				case "front": {
					if (queue.isEmpty()) bw.write("-1" + "\n");
					else bw.write(queue.peek()+ "\n");
					break;
				}
				case "back": {
					if (queue.isEmpty()) bw.write("-1" + "\n");
					else bw.write(real + "\n");
					break;
				}
			}
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
