package 프로그래머스.탐욕법;


import java.io.IOException;
import java.util.*;
public class 구명보트 {
	
public static void main(String args[]) throws IOException {
		
		solution(new int[]{70,80,50,50}, 100);
	}

	public static int solution(int[] people, int limit) {
		
		Arrays.sort(people);
		int answer = 0;

		int min = 0;
		
		// max 값 기점으로
		for (int a = people.length -1; a >= min; a--) {
			
			if (a  == min ) {
				answer++; break;
			}
			
			// 값이 크면 그냥 ++
			if (people[a] + people[min] > limit) {
				answer++;
			}
			else {
				// min값 사용했으니 min++
				min++;
				answer++;
			}
		}
		
		/*
		 * 
		 *  시간초과임
		List<Integer> list = new ArrayList<Integer>();
		for (int a :people) {
			list.add(a);
		}
		
		boolean isOne = false;
		while( !list.isEmpty() ) {
			if( isOne == true ) break;
			max = list.get(0);
			for (int b = list.size() -1; b > 0; b--) {
				max += list.get(b);
				if (max <= limit) {
					answer= answer+ 1;
					max = 0;
					list.remove(b);
					list.remove(0);
					break;
				}
				else {
					max =list.get(0);
				}
			}
			
			if (list.isEmpty()) break;
			if (max == list.get(0)) {
				isOne = true;
			}
			
		}
		
        return answer + list.size();
        */
		return answer;
    }
}
