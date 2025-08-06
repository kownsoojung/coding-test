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
import java.util.stream.Collectors;

public class 다리만들기2 {
	
	static int[][] graph;		// 각 땅마다의 숫자
	static boolean[][] isVisit;	// 땅만들때 방문여부
	static List<Bridge> list = new ArrayList<>(); // 다리 수
	static int bridgeNum = 0;	// 각 땅마다 부여될 번호
	static int[] parents;		// 부모 노드 확인
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nm[0];
		int m = nm[1];
		
		// 각자 길이 * 너비 배열선언
		int[][] data = new int[n][m];
		graph = new int[n][m];
		isVisit = new boolean[n][m];
		for (int a = 0; a < n; a++) {
			data[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		
		// 땅번호 매기기
		for (int a = 0; a < n; a++) {
			for (int b = 0; b< m; b++) {
				if ( data[a][b] == 1 && isVisit[a][b] == false) {
					bridgeNum++;
					makeNum(a, b, data);
				}
			}
		}
		
		// 오른쪽으로 가는 다리 구하기
		for (int a = 0; a < n; a++) {
			for (int b = 0; b< m; b++) {
				if ( data[a][b] == 1 ) {
					// +1을 함으로써 다음 숫자가 0확인
					makeBridgeRight(graph[a][b], a, b+1, 0);
				}
			}
		}
		
		// 왼쪽으로 가는 다리 구하기
		for (int a = 0; a < m; a++) {
			for (int b = 0; b< n; b++) {
				if ( data[b][a] == 1 ) {
					// +1을 함으로써 다음 숫자가 0확인
					makeBridgeBottom(graph[b][a], b+1, a, 0);
				}
			}
		}
		
		// 리스트 중복 제거
		list = list.stream().distinct().collect(Collectors.toList());
		
		Collections.sort(list);
		
		
		// 땅번호 알았으니 부모노드 가져오는 배열 선언
		parents = new int[bridgeNum+1];
		for (int a = 0; a <bridgeNum+1; a++) {
			parents[a] = a;
		}
		
		int answer = 0;
		for (Bridge bridge : list) {
			int a = bridge.a;
			int b = bridge.b;
			if ( findParent(a) != findParent(b)) {
				union(a, b);
				answer+=bridge.len;
			}
		}
		
		int parent = parents[1];
		for (int a = 2; a < bridgeNum+1; a++) {
			
			// 이 문제는 모두 연결됬는지 안됬는지 확인이 필요하여 부모노드를 찾아서 확인해야함
			if (findParent(a) != parent) {
				answer = 0;
                break;
            }
		}
		
		answer = answer == 0 ? -1 : answer;
		System.out.println(answer);
		bw.flush();
		br.close();
		bw.close();
	}
	
	// 부모노드 작은것으로 합치기
	private static void union(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		
		if (a > b) parents[a] =b;
		else  parents[b] =a;
		
	}

	// 부모노드찾기
	private static int findParent(int a) {
		
		if (parents[a] != a) parents[a] = findParent(parents[a] );
		
		return parents[a];
	}

	// 아래쪽 다리 구하기
	private static void makeBridgeBottom(int i, int b, int a, int num) {
		if ( b >= graph.length ) return;

		if ( graph[b][a] != i && graph[b][a] != 0) {
			if (num > 1)list.add(new Bridge(i, graph[b][a], num));
			return;
		}
		
		if ( graph[b][a] == 0 ) {
			num+=1;
			makeBridgeBottom(i, b+1, a, num);
		}
		
	}

	// 오른쪽 다리 구하기
	private static void makeBridgeRight(int i, int a, int b, int num) {
		if ( b >= graph[0].length ) return;
		
		if ( graph[a][b] != i && graph[a][b] != 0) {
			if (num > 1) list.add(new Bridge(i, graph[a][b], num));
			return;
		}
		
		if ( graph[a][b] == 0 ) {
			num+=1;
			makeBridgeRight(i, a, b+1, num);
		}
		
	}

	// 땅번호 매기기
	private static void makeNum(int a, int b, int[][] data) {
		
		
		
		if (a < 0 || a  >= data.length || b < 0 || b  >= data[0].length || data[a][b] == 0) return; 
		
		if ( data[a][b] == 1 && isVisit[a][b] == false) {
			graph[a][b] = bridgeNum;
			isVisit[a][b] = true;
			makeNum(a    , b + 1, data);
			makeNum(a + 1, b    , data);
			makeNum(a - 1, b , data);
			makeNum(a    , b - 1, data);
		}

		
	}

	static class Bridge implements Comparable<Bridge> {
		int a, b, len;
		
		public Bridge (int a, int b, int len) {
			this.a 		= a;
			this.b 		= b;
			this.len 	= len;
		}
		
		@Override
		public int compareTo(Bridge o) {
			
			if ( this.len == o.len ) return this.a - o.a;
			
			return this.len - o.len;
		}  
		
	}
}
