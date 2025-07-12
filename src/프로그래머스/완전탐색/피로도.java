package 프로그래머스.완전탐색;

import java.io.IOException;

public class 피로도 {
	
	public static int max = 0;
	 
	public static void main(String args[]) throws IOException {
		
		solution(80,new int[][]{{80,20},{50,40},{30,10}});
	}
	public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        boolean[] isTrue = new boolean[dungeons.length];
        
        dp(k, dungeons, isTrue, 0, 0);
        answer = max;
        return answer;
    }
	private static void dp(int k, int[][] dungeons, boolean[] isTrue, int sum, int len) {
		
		if (len == dungeons.length) {
			max = Math.max(max, sum);
		}
		
		for (int a = 0; a < dungeons.length; a++) {
			boolean[] temp = isTrue.clone();
			if (!temp[a]) {
				if ( k >= dungeons[a][0]) {
					temp[a] = true;
					dp(k - dungeons[a][1], dungeons, temp, sum+1, len+1);
				}
				else {
					temp[a] = true;
					dp(k - dungeons[a][1], dungeons, temp, sum, len+1);
				}
			}
		}
		
	}
}
