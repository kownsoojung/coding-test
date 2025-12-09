package 단계.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class 중앙값_구하기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int a = 0; a < t; a++) {
			int m = Integer.parseInt(br.readLine());
			List<Integer> list= new ArrayList<Integer>();
			
			if (m == 1) {
				bw.write(1 + " ");
				bw.write(br.readLine() + " ");
				continue;
			}
			int nArr = (m / 10) + (m % 10 == 0 && m > 10 ? 0 : 1);
			
			bw.write( (m/2 + (m%2 == 1 ? 1 : 0))  +"\n");
			
			for (int b = 0; b < nArr; b++) {
				int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				
				for (int i = 0; i < arr.length; i++) {
					list.add(arr[i]);
					
					Collections.sort(list);
					
					if (list.size() % 2 == 1) {
						bw.write(list.get(list.size() / 2) + " ");
					}
				}
				
			}
			bw.write("\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
