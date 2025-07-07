package 프로그래머스.힙;

import java.io.IOException;
import java.util.PriorityQueue;

public class 더맵게 {
public static void main(String args[]) throws IOException {
		
		solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
        
        for (int a : scoville) {
        	pQ.offer(a);
        }
        
        while (true) {
        	
        	
        	if (pQ.peek() >=K ) break;
        	else if ( pQ.size() == 1 ) {
        		answer = -1;
        		break;
        	}
        	else {
        		int a = pQ.poll();
        		int b = pQ.poll();
        		pQ.add(a + (b*2));
        				
        		answer = answer+1;
        	}
        	
        }
        
        return answer;
    }
}
