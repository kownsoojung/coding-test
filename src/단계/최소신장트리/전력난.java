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


public class 전력난 {
	
	static int[] parents;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String input = "";
		while (!input.equals("0 0")) {
			
			int[] mn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int m = mn[0];
			int n = mn[1];
			
			if (m == 0 && n ==0) break;
			List<Home> hList =new ArrayList<>();
			
			int max = 0;
			
			for (int a = 0; a < n; a++) {
				int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				hList.add(new Home(data[0],data[1],data[2]));
				max+=data[2];
			}
			
			Collections.sort(hList);
			
			parents = new int[m+1];
			
			for (int a = 0; a <=m; a++) {
				parents[a] = a;
			}
			
			int sum = 0;
			for (Home home : hList) {
				int x = home.x;
				int y = home.y;
				if (findParent(x) != findParent(y)) {
					union(x, y);
					sum+=home.z;
				}
			}
			
			System.out.println(max - sum);
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	

	private static int findParent(int a) {
		if (parents[a] != a) parents[a] = findParent(parents[a]);
		return parents[a];
	}
	
	private static void union(int x, int y) {
		x = findParent(x);
		y = findParent(y);
		
		if (x > y) parents[x] = y;
		else parents[y] = x;
		
	}

	static class Home implements Comparable<Home>{
		
		int x, y, z;
		
		public Home(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		@Override
		public int compareTo(Home o) {
			if (o.z == this.z) return this.x - o.x;
			return this.z - o.z;
		}
		
	}
}


