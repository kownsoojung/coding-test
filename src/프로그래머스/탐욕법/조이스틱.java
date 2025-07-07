package 프로그래머스.탐욕법;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 조이스틱 {
	
	private static int pre = 0;
	
	public static void main(String args[]) throws IOException {
		
		solution("JAN");
	}
	public static int solution(String name) {
		String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alpha = al.split("");
        
        String[] nameList = name.split("");
        int answer = 0;
        
        int down = 0;
        int up   = 0;
        Arrays.sort(alpha, Collections.reverseOrder());
        for ( int a = 0; a < nameList.length; a++ ) {
        	while (true) {
        		up = up(0, nameList[a],alpha, 0);
        		down = down(0, nameList[a],alpha, 0);
        		
        		int min = Math.min(up, down);
        		
        		answer = answer+ min;
        		break;
			}
        }
        
		
		
        return answer + nameList.length-1;
    }

	private static int up(int prev, String data, String[] alpha, int num) {
		
		if (alpha[prev].equals(data)) {
			return num;
		}
		
		if ( alpha[prev].equals("Z") ) {
			return up(0, data, alpha, num+1);
		}
		
		return up(prev+1, data, alpha, num+1);
	}

	private static int down(int prev, String data, String[] alpha, int num) {
		if (alpha[prev].equals(data)) {
			return num;
		}
		
		if ( alpha[prev].equals("A") ) {
			return down(25, data, alpha, num+1);
		}
		
		return down(prev-1, data, alpha, num+1);
	}
	
}
