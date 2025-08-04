package 프로그래머스.탐욕법;

import java.io.IOException;
import java.util.Arrays;

public class 단속카메라 {
public static void main(String args[]) throws IOException {
	
		solution(new int[][]{{0,1}, {2,3}, {4,5}, {6,7}});
	}


	public static int solution(int[][] routes) {
	    
		int answer = 1;
		Arrays.sort(routes, (o1, o2) -> {
			return o1[1] - o2[1];
		});
		
		
		int max = routes[0][1];
		
		for (int a = 1; a < routes.length; a++) {
			if ( routes[a][0] <= max  && routes[a][1] >=max) {
				
			}
			else {
				max = routes[a][1];
				answer+=1;
			}
			
		}
		
	    return answer;
	}
}
