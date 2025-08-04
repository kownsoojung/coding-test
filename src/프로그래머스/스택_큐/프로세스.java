package 프로그래머스.스택_큐;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
	
	public static void main(String args[]) throws IOException {
		
		solution(new int[]{1,1,9,1,1,1}, 0);
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<int[]>();
        
        int i = 0;
        for (int a : priorities) {
        	
        	q.add(new int[] {a, i});
        	i++;
        }
        
        Integer[] boxedArr = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxedArr, Collections.reverseOrder());
        priorities = Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        int a = 0;
        while (list.size() != priorities.length) {
        	int max = priorities[a];
        	
        	int[] n = q.poll();
        	
        	if (max == n[0]) {
        		list.add(n[1]);
        		a++;
        	}
        	else {
        		q.add(n);
        	}
		}
        
        
        for(int x = 0; x < list.size();x++) {
        	if (list.get(x) == location) {
        		answer = x +1;
        		break;
        	}
        }
        
        return answer;
    }
}
