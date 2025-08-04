package 프로그래머스.동적계획법;

import java.io.IOException;

public class 등굣길 {
	
	static int min;
	static int answer = 0;
	public static void main(String args[]) throws IOException {
		
		solution(4,3, new int[][] {{2,2}});
	}

	public static int solution(int m, int n, int[][] puddles) {
        
        int[][] list = new int[m][n];
        
        list[0][0] = 1;
        
        for (int[] data : puddles) {
        	list[data[0] -1][data[1]-1] = -1; 
        }
        
        for(int a = 0; a < m; a++) {
        	for(int b = 0; b < n; b++) {
            	if ((a == 0 && b == 0) || list[a][b] == -1) continue;
            	
            	int top  = (a == 0 || list[a-1][b] == -1) ? 0: list[a-1][b];
            	int left = (b == 0 || list[a][b-1] == -1) ? 0: list[a][b-1];
            	
            	list[a][b] = top+ left;
            	
            }
        }
        
        return list[m-1][n-1];
    }

	private static void dp(int i, int j, boolean[][] list, int m, int n) {
		
		if (i == m && j == n) {
			answer = answer + 1;
		}
		
		
		if (i != m) {
			if ( list[i+1][j] != false ) dp(i+1, j, list, m,n);
		}
		if (j != n) {
			if ( list[i][j+1] != false ) dp(i, j+1, list, m,n);
		}
	}
}
