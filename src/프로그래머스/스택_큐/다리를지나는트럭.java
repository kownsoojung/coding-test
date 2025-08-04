package 프로그래머스.스택_큐;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public static void main(String args[]) throws IOException {
		
		solution(2, 10, new int[] {7,4,5,6});
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        
        
        
        int i = 0;
        int sum = 0;
        while (i != truck_weights.length || !q.isEmpty()) {
        	answer++;
        	
        	if (!q.isEmpty()) {
        		int[] end = q.peek();
        		if (end[1] <= answer) {
        			q.poll();
            		sum -= end[0];
        		}
        		
        	}
        	
        	if (i < truck_weights.length && sum+truck_weights[i] <= weight ) {
        		if (q.size() == bridge_length) continue;
        		q.add(new int[]{truck_weights[i], answer + bridge_length});
        		sum += truck_weights[i]; 
        		i++;
        	}
        	
			
		}
        
        return answer;
    }
}
