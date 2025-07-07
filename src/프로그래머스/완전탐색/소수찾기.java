package 프로그래머스.완전탐색;

import java.io.IOException;
import java.util.HashMap;

public class 소수찾기 {
	public static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int answer = 0;
	public static void main(String args[]) throws IOException {
		
		solution("1276543");
	}
	
	public static int solution(String numbers) {
        
        String[] numList = numbers.split("");
        
        for ( int a = 0; a < numList.length; a++ ) {
        	String n = numList[a];
        	boolean[] isTrue = new boolean[numList.length];
        	isTrue[a] = true;
        	map.put(Integer.parseInt(n), map.getOrDefault(Integer.parseInt(n), 0) + 1);
        	
        	dp(1, n, numList, isTrue);
        }
        
        map.forEach((key, value)-> {
        	boolean isTrue = true;
        	if (key == 0 || key == 1) {
    		}
    		else if ( key == 2) {
    			answer = answer+1;
    		}
    		else {
	        	for (int a = 2; a < key; a++) {
	        		
	        		if (key % a == 0 ) {
	        			isTrue = false;
	        			break;
	        		}
	        	}
	        	if (isTrue) answer = answer+1;
    		}
        	
        });
        System.out.println(answer+ "dddd" + map.size());
        return answer;
    }

	private static  void dp(int i, String n, String[] numList, boolean[] isTrue) {
		if (i == numList.length) {
			return;
		}
		
		for (int a = 0; a < numList.length;a++) {
			boolean[] isTrue2 = isTrue.clone();
			if (isTrue2[a] == false) {
				isTrue2[a] = true;
				String n2 = n + numList[a];
				
				map.put(Integer.parseInt(n2), map.getOrDefault(Integer.parseInt(n2), 0) + 1);
				
				dp(i+1, n2, numList, isTrue2);
			}
		}
		
	}
}
