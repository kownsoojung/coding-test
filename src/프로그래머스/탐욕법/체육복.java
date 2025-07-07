package 프로그래머스.탐욕법;

import java.io.IOException;
import java.util.Arrays;

public class 체육복 {
	
	public static void main(String args[]) throws IOException {
		
		solution(5, new int[] {4,2}, new int[] {3, 5});
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
        answer = n - lost.length;
        
        int[] list = new int[n];
        
        Arrays.sort(lost);
        
        for (int a = 0; a < reserve.length; a++) {
        	list[reserve[a] -1 ] = 1;
        }
        
        for (int a = 0; a < lost.length; a++) {
        	if (list[lost[a] -1 ] == 1) {
        		list[lost[a] -1 ] = 0;
                lost[a] = 0;
                answer++;
        	}
        }
        
        
        for (int a = 0; a < lost.length; a++) {
        	int nList = lost[a];
        	
            if (lost[a] == 0) continue;
        	if (nList == 1) {
        		if (list[nList] > 0) {
        			list[nList] = list[nList] -1;
        			answer++;
        		}
        	}
        	else if (nList == n) {
    			if (list[nList -2] > 0) { 
    				list[nList-2] = list[nList-2] -1;
        			answer++;
    			}
    		}
    		else {
    			if (list[nList -2] > 0) { 
    				list[nList-2] = list[nList-2] -1;
        			answer++;
    			}
    			else {
    				if (list[nList] > 0) { 
        				list[nList] =list[nList] -1;
            			answer++;
    				}
    			}
    		}

        }
        return answer;
    }
}

