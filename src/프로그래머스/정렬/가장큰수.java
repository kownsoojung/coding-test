package 프로그래머스.정렬;

import java.io.IOException;
import java.util.Arrays;

public class 가장큰수 {
	public static void main(String args[]) throws IOException {
		int[] numbers = {6,10,2};
		
		solution(numbers);
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] sNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(sNumbers, (a, b)-> (b+a).compareTo(a+b));
        
        
        if (sNumbers[0].equals("0")) {
        	answer = "0";
        }
        else {
        	for (String a : sNumbers) {
        		answer = answer+ a;
        	}
        }
        return answer;
    }

}
