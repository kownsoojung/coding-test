package 프로그래머스.힙;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class 이중우선큐 {
	public static void main(String args[]) throws IOException {
		
		solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
	}

	public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
        
        for ( String a : operations ) {
        	String[] data = a.split(" ");
        	
        	int num = Integer.parseInt(data[1]);
        	switch (data[0]) {
				case "I": {
					pqMin.add(num);
					pqMax.add(num);
					
					break;
				}
				case "D": {
					if (pqMax.size() == 0) break;
					
					if (num == 1) {
						int max = pqMax.poll();
						pqMin.remove(max);
					}
					else {
						int min = pqMin.poll();
						pqMax.remove(min);
					}
					break;
				}
        	}
        }
        
        if (pqMax.size() == 0) {
        	answer = new int[] {0,0};
        }
        else {
        	answer = new int[] {pqMax.peek(),pqMin.peek()};
        }
        return answer;
    }
}
