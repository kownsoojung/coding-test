package 프로그래머스.동적계획법;

import java.io.IOException;

public class 도둑질 {
	
	
	static int max = 0;
	static long[] endList;
	public static void main(String args[]) throws IOException {
		
		solution(new int[] {1,2,3,1});
	}
	public static int solution(int[] money) {
        int answer = 0;
        endList= new long[money.length];
        dp(0, 0, money);
        
        answer = max;
        return answer;
    }
	private static void dp(int len, int sum, int[] money) {
		
		
		if (len >= money.length) {
			max = Math.max(sum, max);
			return;
		}
		
		for (int a = len; a < money.length; a++) {
			dp(a+2, money[a] + sum,money);
		}
		
	}
}
