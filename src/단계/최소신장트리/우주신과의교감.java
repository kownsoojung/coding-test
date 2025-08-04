package 단계.최소신장트리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 우주신과의교감 {
	
	static int[] parents; 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0]; // 우주신 개수
		int m = nm[1]; // 연결된 신들과의 통로개수
		
		int[][] xy = new int[n][2];
		// 황선자 포함 우주신들의 좌표
		for (int a = 0; a < n; a++) {
			xy[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		
		parents = new int[n+1];
		for (int a = 1; a <= n; a++) {
			parents[a] = a;
		}
		
		// 이미 연결된 통로
		for (int a = 0; a < m; a++) {
			int[] use = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			if (findParents(use[0]) != findParents(use[1])) {
				union(use[0], use[1]);
			}
		}
		
		List<Bridge> bList = new ArrayList<Bridge>();
		for (int a = 0; a < n -1; a++) {
			
			for (int b = a+1; b < n; b++) {
				int w = Math.abs(xy[b][0] - xy[a][0]);
				int h = Math.abs(xy[b][1] - xy[a][1]);
				double x;
				if (w == 0 || h == 0) {
					if (w == 0 ) x = h;
					else x = w;
				}
				else {
					x = Math.sqrt( Math.pow(w, 2) + Math.pow(h, 2) );
				}
				bList.add(new Bridge(a+1, b+1, x));
			}
		}
		
		Collections.sort(bList);
		double sum = 0;
		
		for (Bridge bridge : bList) {
			if (findParents(bridge.a) != findParents(bridge.b)) {
				union(bridge.a, bridge.b);
				sum+=bridge.x;
			}
		}
		
		double rtnSum = Math.round(sum * 100) / 100.0;
		String formattedNumber = String.format("%.2f", rtnSum);

		System.out.println(formattedNumber);
		
		bw.flush();
		br.close();
		bw.close();
	}

	static class Bridge implements Comparable<Bridge> {
		int a, b;
		double x;
		
		public Bridge(int a, int b, double x) {
			this.a = a;
			this.b = b;
			this.x = x;
		}
		@Override
		public int compareTo(Bridge o) {
			if (this.x == o.x) return this.a - o.a;
			return Double.compare(this.x, o.x);
		}
		
	}
	private static int findParents(int i) {
		// TODO Auto-generated method stub
		if (parents[i] != i) parents[i] = findParents(parents[i]);
		
		return parents[i];
	}

	private static void union(int i, int j) {
		i = findParents(parents[i]);
		j = findParents(parents[j]);
		
		if (i > j) parents[i] = j;
		else parents[j] = i;
		
		
	}
}
