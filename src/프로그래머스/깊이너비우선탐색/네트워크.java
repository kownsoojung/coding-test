package 프로그래머스.깊이너비우선탐색;

import java.util.Arrays;

public class 네트워크 {
	
		
	public int solution(int n, int[][] computers) {
        
        Boolean[] network = new Boolean[n];
        
        Arrays.fill(network, false);
        int answer = 0;
        
        for (int a = 0; a < n; a++) {
        	if (network[a] == false) {
        		answer++;
        		dfs(a, network, computers);
        	}
        }
        
        return answer;
    }

	private void dfs(int a, Boolean[] network, int[][] computers) {
		network[a] = true;
		for (int i = 0; i < computers.length; i++) {
        	if (network[i] == false && computers[a][i] == 1) {
        		dfs(i, network, computers);
        	}
        }
	}
	
}
