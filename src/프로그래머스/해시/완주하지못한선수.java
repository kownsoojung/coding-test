package 프로그래머스.해시;

import java.util.*;

public class 완주하지못한선수 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String data: participant) {
        	map.put(data, map.getOrDefault(data, 0) + 1);
        }
        
        for(String comp : completion) {
        	map.put(comp, map.get(comp) -1 );
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			if (val > 0) {
				answer = key;
				break;
			}
		}
        return answer;
    }
}
