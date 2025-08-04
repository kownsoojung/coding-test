package 프로그래머스.동적계획법;

import java.io.IOException;
import java.util.HashMap;

public class N으로표현 {
	
	static int answer = 999999999;
	public static void main(String args[]) throws IOException {
		
		solution(4,31);
	}
	public static int solution(int N, int number) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for (int a = 1; a <= 8; a++) {
        	int repeatN = Integer.parseInt(String.valueOf(N).repeat(a));
        	map.put(a, repeatN);
        }
        		
        dp(0, (long) 0, map, number);
        
        if (answer == 999999999) answer = -1;
        return answer;
    }
	private static void dp(int cnt,  Long sum, HashMap<Integer, Integer> map, int n) {
		
		if (cnt >= 8 ) return;
		
		if (sum == n) {
			answer = Math.min(cnt, answer);
		}
		for (int a = 1; a <= 8; a++ ) {
			int data = map.get(a);
			
			dp(cnt + a, sum + data, map,n);
			dp(cnt + a, sum - data, map,n);
			dp(cnt + a, sum / data, map,n);
			dp(cnt + a, sum * data, map,n);
			
			for (int b = 1; b <= 8; b++ ) {
				dp(cnt + a + b, sum / (data + map.get(b)), map, n);
				dp(cnt + a + b, sum + (data / map.get(b)), map, n);
				dp(cnt + a + b, sum * (data - map.get(b)), map, n);
				dp(cnt + a + b, sum - (data * map.get(b)), map, n);
			}
			
		}
		
	}
}

