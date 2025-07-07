package 프로그래머스.정렬;

import java.util.Arrays;

public class Hindex {
	public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int answer = 0;        
        int len = citations.length;                        
        for(int i = 0; i < len; i++){            
        	if(citations[i] >= len - i) { 
        		answer = len - i;                
        		break;            
        	}        
        }
        return answer;
    }
}
