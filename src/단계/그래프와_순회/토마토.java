package 단계.그래프와_순회;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 토마토 {
	static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static int[][] arr;
    static Queue<int[]> q = new LinkedList<>();
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		m = nm[0];
		n = nm[1];
		
		arr = new int[n][m];
		
		for (int a = 0; a < n; a++) {
			arr[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		for (int a = 0; a < n; a++) {
			for (int b = 0; b <m; b++) {
				if (arr[a][b] == 1) {
					q.add(new int[] {a, b});
				}
			}
		}
		
		bfs();
		bw.flush();
		br.close();
		bw.close();
	}

	private static void bfs() {
		
		while(!q.isEmpty()) {
			int[] data = q.poll();
			
			int x = data[0];
			int y = data[1];
			
			for (int a = 0; a <4;a ++) {
				int nx = x + dx[a];
				int ny = y + dy[a];
				
				if (nx < 0 || nx >=n || ny <0 ||ny >=m) continue;
				
				if (arr[nx][ny] == 0) {
					arr[nx][ny] = arr[x][y] +1;
					
					q.add(new int[] {nx, ny});
				}
			}
		}
		
		
		int max = 0;
		
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < m; b++) {
				if (arr[a][b] == 0) {
					System.out.println(-1);
					return;
				}
				else {
					max = Math.max(max, arr[a][b]);
				}
			}	
		}
		
		System.out.println(max -1);
	}
}
