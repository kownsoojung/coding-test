package 프로그래머스.프로그래머스2025_2차;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class 서버증설횟수 {
	public static void main(String args[]) throws IOException {
		
		solution(new int[] {0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, 1,1);
	}

	static public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        // 기존 서버 1대
        int server = 1;
        Queue<int[]> q = new LinkedList<int[]>(); // 큐를 톻해 선입선출
        
        
        // 지나간 시간 초
        int time = 0;
        for (int play : players) {
        	time++; // 1초씩 증가!
        	
        	// 큐에 데이터가 있으면서 맨 처음 넣은 시간과 현재 시간이 동일할 경우
        	if (q.size() != 0 && q.peek()[0] == time) {
        		int[] a = q.poll();
        		server -= a[1];
        	}
        	
        	// 사용자가 서버증설 * 사용자와 동일하거나 같을 경우
        	if ( play >= m * server) {
        		int data = ((play - (m * server)) / m) + 1; // 현재 서버 - 서버증설 + 1로 한다.. 같을 경우도 +하기때문에 나머지 신경 안써도된다.
        		
        		server +=data;
        		q.add(new int[] {time + k, data});
        		answer+=data;
        	}
        	
        }
        return answer;
    }
}
