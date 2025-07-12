package 프로그래머스.완전탐색;

import java.io.IOException;

public class 카펫 {
	public static int x = 3;
	public static int y = 3;
	public static int sum = 0;
	public static void main(String args[]) throws IOException {
		
		solution(18, 6);
	}
	
	public static int[] solution(int brown, int yellow) {
		int[] answer = {};
        
        
        sum = brown + yellow;
        
        dp(brown, yellow);

        answer = new int[]{x, y};
        return answer;
    }
	
	private static void dp(int brown, int yellow) {
		
		while(true) {
			
			int temp = sum / x;
			if (sum % x == 0 && temp <= x) {
				if ((x - 2) *  (temp - 2) == yellow) {
					y = temp;
					break;
				}
			}
			
			x = x+1;
		}
		
	}
}
