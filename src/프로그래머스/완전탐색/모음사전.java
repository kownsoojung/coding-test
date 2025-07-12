package 프로그래머스.완전탐색;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 모음사전 {
	
	public static String[] alpha = {"A", "E", "I", "O", "U"};
	public static ArrayList<String> list = new ArrayList<String>();
	
    
	public static void main(String args[]) throws IOException {
		solution("AAAAE");
	}
	
	public static int solution(String word) {
        int answer = 0;
        
        dp("", 1);
        List<String> ddd = list;

        Collections.sort(ddd);
        
        for (int a = 0; a < ddd.size(); a++) {
        	if (word.equals(ddd.get(a))) {
        		answer = a + 1;
        	}
        }
        
        return answer;
    }

	private static void dp(String data, int num) {
		if (num == 6) return;
		
		for (int a = 0; a < alpha.length; a++) {
			list.add(data + alpha[a]);
			dp(data + alpha[a], num+1);
		}
		
	}
}
