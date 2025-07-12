package 프로그래머스.완전탐색;

import java.io.IOException;
import java.util.HashMap;

public class 전력망을둘로나누기 {
	public static void main(String args[]) throws IOException {
		
		 
		solution(new int[][]{{1, 5}, {2, 5}, {3, 6}, {3, 7}, {3, 12}, {4, 5}, {4, 7}, {4, 10}, {8, 9}, {9, 10}, {11, 12}});
	}
	public static int solution(int[][] wires) {
        int answer = 9999;
        
        for ( int x = 0; x <wires.length; x++ ) {
        	int a = wires[x][0];
        	int b = wires[x][1];
        	boolean[] isTrue = new boolean[wires.length];
        	isTrue[x] = true;
        	int sum = 1;
        	HashMap<Integer, Integer> aLine = new HashMap<Integer, Integer>();
        	aLine.put(a, 0);
        	
            HashMap<Integer, Integer> bLine = new HashMap<Integer, Integer>();
            bLine.put(b, 0);
            
            while (sum != wires.length) {
				for (int y = 0; y < wires.length; y++) {
					if (isTrue[y] == true) continue;
					boolean visit = false;
					if( aLine.containsKey(wires[y][0])) {
						visit = true;
            			aLine.put(wires[y][1], aLine.getOrDefault(wires[y][1], 0) +1);
            		}
            		if( aLine.containsKey(wires[y][1])) {
            			visit = true;
            			aLine.put(wires[y][0], aLine.getOrDefault(wires[y][0], 0) +1);
            		}
            		if( bLine.containsKey(wires[y][0])) {
            			visit = true;
            			bLine.put(wires[y][1], bLine.getOrDefault(wires[y][1], 0) +1);
            		}
            		if( bLine.containsKey(wires[y][1])) {
            			visit = true;
            			bLine.put(wires[y][0], bLine.getOrDefault(wires[y][0], 0) +1);
            		}
            		
            		if (visit) {
            			sum = sum+1;
            			isTrue[y] = true;
            		}
				}
			}
            
            
            int temp = Math.abs(aLine.size() - bLine.size());
            answer = Math.min(temp, answer);
            
        }
        return answer;
    }
}
