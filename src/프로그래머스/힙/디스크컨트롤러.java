package 프로그래머스.힙;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {
	
	public static void main(String args[]) throws IOException {
		
		solution(new int[][]{{0,3},{1,9},{3,5}});
	}

	public static int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        Arrays.sort(jobs, (a,b)-> a[0] - b[0]);
        PriorityQueue<int[]> pq =new PriorityQueue<>(new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		if (o1[1]==o2[1]) {
        			return o1[0]- o2[0];
        		}
        		return o1[1]- o2[1];
        	}
		});
        
        for (int[] a : jobs) {
        	pq.offer(a);
        }
        
        while(!pq.isEmpty()) {
        	int[] data = pq.poll();
        	
        	time = time + data[1];
        	answer += time - data[0];
        	 
        }
        return answer / jobs.length;
    }
	
	
}

