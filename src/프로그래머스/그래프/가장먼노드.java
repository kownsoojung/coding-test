package 프로그래머스.그래프;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 가장먼노드 {
	public static void main(String args[]) throws IOException {
		
		solution(6, new int[][] {{1, 3}, {1, 6}, {3, 4}, {3, 5}, {3, 6}, {5, 2}, {6, 2}});
	}
	
	static int[] arr;
	static boolean[] visit;
	static List<Integer>[] list;
	
    public  static int solution(int n, int[][] edge) {
        int answer = 0;
        
        
        arr   = new int[n+1]; 			// 배열마다 지나간 곳 길이 수
        visit = new boolean[n+1];		// 도착여부	
        list  = new ArrayList[n+1];		// 양방향 그래프로 각 노드마다 지나가는 배열
        
        
        // 각 노드별 arrayList 생성
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        
        // 양방향으로 전체 다 추가
        for (int[] data : edge) {
        	list[data[0]].add(data[1]);
        	list[data[1]].add(data[0]);
        }
        
        // q로 while문 돌리기
        Queue<Integer> q = new LinkedList<Integer>();
        
        
        // 무조건 1부터 시작으로 1 넣고
        q.add(1);
        visit[1] = true; // 1은 방문한것으로  변경
        
        while (!q.isEmpty()) {
        	int node = q.poll();
			List<Integer> nList= list[node];
        	for (int a = 0; a < nList.size(); a++) {
        		if (visit[nList.get(a)] == false) { // 이미 방문한 노드는 패수패수
        			visit[nList.get(a)] = true; 
        			q.add(nList.get(a));
        			arr[nList.get(a)] = arr[node] +1;
        		}
        	}
		}
        
        
        Arrays.sort(arr);
        
        int max = arr[n];
        
        for (int a = n; a >= 0;a--) {
        	if (max == arr[a]) answer++;
        }
        
        return answer;
    }
}
