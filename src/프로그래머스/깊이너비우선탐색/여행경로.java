package 프로그래머스.깊이너비우선탐색;

public class 여행경로 {
	
	private static String[] answer; 
	
	public static void main(String args[]) {
		String[][] words = new String[][]{{"ICN", "AAA"}, {"AAA", "ICN"}, {"ICN", "CCC"}, {"CCC", "ICN"}, {"ICN", "DDD"}, {"DDD", "AAA"}};
		
		solution(words);
	}
	
	
	public static String[] solution(String[][] tickets) {
        boolean[] isCheck = new boolean[tickets.length];
        String[] data = new String[tickets.length + 1];
        answer = new String[tickets.length + 1];
        
        dfs(0, tickets, isCheck, data);
        
        return answer;
    }

	private static void dfs(int depth, String[][] tickets, boolean[] isCheck, String[] data) {
		if (depth == tickets.length) {
			if (answer[0] == null) {
				answer = data.clone();
				return;
			}
			else {
				for (int a = 0; a < data.length; a++) {
					if (data[a].compareTo(answer[a]) > 0) {
						return;
					}
					if (data[a].compareTo(answer[a]) < 0) {
						answer = data.clone();
						return;
					}
					
				}
			}
		}
		
		
		for (int a = 0; a < tickets.length; a++) {
        	boolean[] sisCheck = isCheck.clone();
			String[] sdata = data.clone();
			if (sdata[0] == null) {
				if (tickets[a][0].equals("ICN")) {
					sisCheck[a] = true;
					sdata[0] = "ICN";
					sdata[1] = tickets[a][1];
					
					dfs(1, tickets, sisCheck, sdata);
				}
			}
			else {
				if ( sisCheck[a] == false && sdata[depth].equals(tickets[a][0]) ) {
					sisCheck[a] = true;
					sdata[depth + 1] = tickets[a][1];
					dfs(depth+1, tickets, sisCheck, sdata);
				}
			}
        }
		
	}
}
