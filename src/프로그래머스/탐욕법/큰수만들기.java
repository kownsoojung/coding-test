package 프로그래머스.탐욕법;

import java.io.IOException;

public class 큰수만들기 {
	
	public static void main(String args[]) throws IOException {
		
		solution("190000002", 3);
	}
	
	
	public static String solution(String number, int k) {
        int x = 0;
        StringBuilder sb = new StringBuilder();
        
        
        // 전체 길이 - k 번 실행( 총 숫자길이만큼)
        for (int a = 0; a < number.length() - k; a++) {
        	int max = 0;
        	
        	// 실행되는 위치 + k번
        	for (int b = x; b <= a + k; b++) {
        		
        		// charAt 로  - 0
        		int n = number.charAt(b) - '0';
        		
        		// n이 0보다 크면
        		if (max < n) {
        			// max에 집어넣고
                    max = Math.max(n, max);
                    
                    // 실행되는 위치+하기
                    x = b+1;
                }
        	}
        	sb.append(max);
        		
        }
        
        return sb.toString();
    }
	
}
