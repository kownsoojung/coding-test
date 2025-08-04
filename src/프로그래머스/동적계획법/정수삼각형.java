package 프로그래머스.동적계획법;

import java.io.IOException;

public class 정수삼각형 {
	public static void main(String args[]) throws IOException {
		solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
	}

	public static int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] endList = new int[triangle.length][triangle.length];
        
        endList[0][0] = triangle[0][0];
        for (int a = 1; a < triangle.length; a++) {
        	int[] data = endList[a -1];
        	for (int b = 0; b < triangle[a-1].length; b++) {
       			endList[a][b] = Math.max( triangle[a][b] + data[b], endList[a][b]);
       			answer = Math.max(answer, endList[a][b]);
       			endList[a][b+1] = Math.max( triangle[a][b+1] + data[b], endList[a][b+1]);
       			answer = Math.max(answer, endList[a][b+1]);
       			
        	}
        }
        
        return answer;
    }
}
