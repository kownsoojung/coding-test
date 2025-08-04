package 단계.최소신장트리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 최소스패닝트리 {
	
	static int parent[];
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int[] ve = Arrays.stream( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int v = ve[0];
		int e = ve[1];
		
		parent = new int[v+1];
		List<Tree> list = new ArrayList<>();
		
		for (int a = 0; a < e; a++) {
			int[] data = Arrays.stream( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			list.add(new Tree(data[0], data[1], data[2]));
		}
	
		Collections.sort(list);
		for (int a = 0; a <= v; a++) {
			parent[a] = a;
		}
		
		int rtn = 0;
		for (Tree data : list) {
			int a = data.a;
			int b = data.b;
			if(findParent(a) != findParent(b)) {
				unionData(a, b);
				rtn+=data.c;
			}
		}
		
		
		System.out.println(rtn);
		bw.flush();
		br.close();
		bw.close();
	}
	
	private static void unionData(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		
		if (a > b) parent[a] = b;
		else parent[b] = a;
		
	}

	private static int findParent(int a) {
		
		if (parent[a] != a) parent[a] = findParent(parent[a]);
		
		return parent[a];
	}

	static class Tree implements Comparable<Tree> {
		
		int a, b, c;
		
		public Tree(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		@Override
		public int compareTo(Tree o) {
			
			if (this.c == o.c ) {
				return this.a - o.a;
			}
			// TODO Auto-generated method stub
			return this.c - o.c;
		}
		
	}
}
