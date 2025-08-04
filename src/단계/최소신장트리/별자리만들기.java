package 단계.최소신장트리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 별자리만들기 {
	
	static int[] parents;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 별자리 개수
		int n = Integer.parseInt(br.readLine());
		
		
		// 별자리 위치 넣기
		double[][] list = new double[n][2];
		for (int a = 0; a < n; a++) {
			list[a] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		}
		
		// 위치 sorting 
		Arrays.sort(list, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				if (o1[0] ==  o1[0]) return Double.compare(o1[1], o1[1]);
				return Double.compare(o1[0], o1[0]);
			}
		});
		
		
		// 별자리 각 구간별 길이값 구하기
		List<Bridge> bList = new ArrayList<Bridge>();
		for (int a = 0; a < n-1; a++) {
			
			for (int b = a + 1; b < n; b++) {
				double w = list[b][0] -list[a][0];
				double h = list[b][1] -list[a][1];
				
				double x = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
				bList.add(new Bridge(a, b, x));
			}
		}
		
		// 별자리 위치 sorting
		Collections.sort(bList);
		parents = new int[n+1];
		
		// 별자리별 최고 부모자리
		for (int a= 1; a<= n; a++) {
			parents[a] = a;
			
		}
		
		double answer = 0;

		for (Bridge bridge : bList) {
			int a = bridge.a;
			int b = bridge.b;
			if (findParent(a) !=  findParent(b) ) {
				union(a, b);
				answer += bridge.x;
			}
		}
		
		double formattedNumber = Math.round(answer * 100) / 100.0;
		System.out.println(formattedNumber);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	private static void union(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		
		if (a > b) parents[a] = b;
		else parents[b] = a;
		
	}

	private static int findParent(int a) {
		if (parents[a] != a ) parents[a] = findParent(parents[a]);
		return parents[a];
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
}
