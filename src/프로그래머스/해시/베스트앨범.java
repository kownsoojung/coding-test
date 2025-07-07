package 프로그래머스.해시;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
	public static void main(String args[]) throws IOException {
		
		solution(new String[]{"a", "b", "b", "c", "c"}, new int[]{5, 5, 40, 5, 5});
	}


	public static int[] solution(String[] genres, int[] plays) {
		
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		HashMap<String, HashMap<Integer, Integer>> maps2 = new HashMap<String, HashMap<Integer, Integer>>();
		
		ArrayList<Integer > rtnList = new ArrayList<Integer>();
		for (int a = 0; a < plays.length; a ++) {
			maps.put(genres[a], maps.getOrDefault(genres[a], 0) + plays[a]);
			if (!maps2.containsKey(genres[a])) {
				HashMap<Integer, Integer> album = new HashMap<Integer, Integer>();
				album.put(a, plays[a]);
				maps2.put(genres[a], album);
			}
			else {
				HashMap<Integer, Integer> album = maps2.get(genres[a]);
				album.put(a, plays[a]);
				maps2.put(genres[a], album);
			}
		}
		
		List<Map.Entry<String, Integer>> generesList = new LinkedList<>(maps.entrySet());
		
		generesList.sort((o1, o2) -> maps.get(o2.getKey()) - maps.get(o1.getKey()));
		
		for (Map.Entry<String, Integer> genre : generesList) {
			HashMap<Integer, Integer> album = maps2.get(genre.getKey());
			List<Map.Entry<Integer, Integer>> playList = new LinkedList<>(album.entrySet());

			playList.sort((o1, o2) -> album.get(o2.getKey()) - album.get(o1.getKey()));

			/*playList.sort((o1, o2) -> {
				if ( album.get(o2.getKey()) == album.get(o1.getKey())  ) {
					return o1.getKey().compareTo(o2.getKey());
				}
				return album.get(o2.getKey()) - album.get(o1.getKey()); 
			});*/
			
			int idx =0;
			for (Map.Entry<Integer, Integer> play : playList) {
				
				if (idx == 2) break;
				rtnList.add(play.getKey());
				idx++;
			}
		} 
		int[] answer = rtnList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
