package 프로그래머스.해시;

import java.util.Arrays;

public class 전화번호_목록 {
	
	
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        phone_book = new String[3];
        
        Arrays.sort(phone_book);
        
        for (int a = 0; a  < phone_book.length; a ++) {
        	for (int b = a; b < phone_book.length -1; b++) {
        		if ( phone_book[b].startsWith(phone_book[a]) == true ) return false;
        	}
        	
        }
        return answer;
    }
}
