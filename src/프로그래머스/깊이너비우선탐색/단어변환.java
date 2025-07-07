package 프로그래머스.깊이너비우선탐색;

import java.util.Arrays;

public class 단어변환 {
	
	private static int min = 99999;
	
	public static void main(String args[]) {
		단어변환 s = new 단어변환();
		String begin = "hit";
		String target = "cog";
		String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
		
		solution(begin, target, words);
	}
	
	public static int solution(String begin, String target, String[] words) {
		
		begin = "hit";
		target = "cog";
		words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
				
        boolean[] isChange = new boolean[target.length()];
        
		if (Arrays.stream(words).anyMatch(target::equals) == false ) {
			return 0;
		}
		
		
		dfs(0, words, begin, target, isChange);
		
		System.out.println(min);
        return min == 99999 ? 0 : min;
    }

	private static void dfs(int cnt, String[] words, String begin, String target, boolean[] isChange) {
		
		if (begin.equals(target)) {
			min = Math.min(min, cnt);
			return;
		}
		
		for (int a = 0; a < begin.length(); a++) {
				boolean[] isChanges = isChange.clone();
				
				isChanges[a] =true;
				String sBegin = begin.substring(0, a) + begin.substring(a + 1);
				for (int b = 0; b < words.length; b++) {
					if (! words[b].equals("-")) {
						String sWord = words[b].substring(0, a) +  words[b].substring(a + 1);
						if (sBegin.equals(sWord)) {
							String[] nWorld = words.clone();
							nWorld[b] = "-";
							dfs(cnt+1, nWorld, words[b], target, isChanges);
						}
					}
				}
		}
	}
}
