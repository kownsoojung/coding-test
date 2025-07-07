package 프로그래머스.정렬;

import java.io.IOException;
import java.util.Arrays;

public class K번쨰수 {
	public static void main(String args[]) throws IOException {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for (int a = 0; a < commands.length; a++) {
        	int[] b = new int[commands[a][1]- commands[a][0] + 1];
        	// 원배열, 원본배열 시작위치, 대상배열, 대상배열 시작위치, 복사할 길이 
        	System.arraycopy(array, commands[a][0] -1 , b, 0, commands[a][1]- (commands[a][0] -1));
        	Arrays.sort(b);
        	
        	answer[a] = b[commands[a][2] -1 ];
        	
        }
        
        return answer;
    }
}
