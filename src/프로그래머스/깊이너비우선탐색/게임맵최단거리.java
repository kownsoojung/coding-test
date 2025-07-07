package 프로그래머스.깊이너비우선탐색;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	
	
	public int solution(int[][] maps) {
        
        int[][] visit = new int[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<int[]>();
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        
        queue.offer(new int[] {0, 0});
        visit[0][0] = 1;
        
        while (!queue.isEmpty()) {
        	int[] pos = queue.poll();
        	
        	int x = pos[0]; 
        	int y = pos[1];
        	
        	if (x == maps.length -1 && y == maps[0].length -1) return visit[x][y];
        	
        	for (int i = 0; i < 4; i++) {
        		int nx = x + dx[i]; 
        		int ny = y + dy[i];
        		
        		if (0 <= nx && nx < maps.length 
        				&& 0 <= ny && ny < maps[0].length 
        				&& maps[nx][ny] == 1 
        				&& visit[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny});
                    visit[nx][ny] = visit[x][y] + 1;
                }
        		
        		
        	}
        }
        
        return -1;
    }
	
	
}
