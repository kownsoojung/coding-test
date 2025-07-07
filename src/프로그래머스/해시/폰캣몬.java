package 프로그래머스.해시;

import java.util.HashMap;

public class 폰캣몬 {
	public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        
        for (int a =0 ; a < nums.length; a++) {
        	maps.put(nums[a], maps.getOrDefault(maps.get(nums[a]), 0)  + 1);
        }
        
        int max = nums.length / 2;
        
        if (max <= maps.size()) {
        	 answer = max;
        }
        else {
        	answer = maps.size();
        }
        
        
        return answer;
    }
}
