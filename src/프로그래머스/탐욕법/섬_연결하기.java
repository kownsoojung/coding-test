package 프로그래머스.탐욕법;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 섬_연결하기 {
	

	public static void main(String args[]) throws IOException {
		solution(4, new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}});
	}
	static int[] parents;
	public static int solution(int n, int[][] costs) {
		
		int answer = 0;
        int len = costs.length;
        
        List<Bridge> bridges = new ArrayList<>();
        
        for (int a = 0; a < len; a++) {
        	Bridge bg = new Bridge(costs[a][0], costs[a][1], costs[a][2]);
        	bridges.add(bg);
        }
        
        Collections.sort(bridges);
        parents = new int[n +1];
        
        // 초기에는 자기 자신이 각 섬의 부모가 되도록 설정
        for (int a = 0; a <= n; a++) {
        	parents[a] = a;
        }
        
        
        // 비용이 낮은 다리부터 탐색
        for (Bridge bridge : bridges) {
        	
        	// 두 섬이 다른 집합에 있을 경우 union 연산 수행
        	if (findParent(bridge.src) != findParent(bridge.dest)) {
                union(bridge.src, bridge.dest);
                // 다리비용 더하기
                answer += bridge.cost;
            }
        }
        
        return answer;
    }



	// 대표 부모 노드를 찾는 재귀매서드
	private static int findParent(int src) {
		if (parents[src] != src) {
			parents[src] = findParent(parents[src]);
		}
		
		return parents[src];
	}


	// 하나의 집합으로 합침, 두 집합의 대표 부모를 찾은 후 더 작은 번호의 노드가 부모가 되도록 함. 병합트리구조 ㅎ여셩
	private static void union(int a, int b) {
		a = findParent(a);
        b = findParent(b);
        
        if (a < b) {
            parents[b] = a;
        } else {
            parents[a] = b;
        }
	}
	
	static class Bridge implements Comparable<Bridge> {
		
		int src, dest, cost;
		public  Bridge(int src, int dest, int cost) {
			 this.src = src;
	         this.dest = dest;
	         this.cost = cost;
		}
		@Override
		public int compareTo(Bridge b) {
			if(this.cost == b.cost) {
                return this.src - b.src;
            }
            return this.cost - b.cost;
		}
		
		
	}
}
