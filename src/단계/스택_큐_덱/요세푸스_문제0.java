package 단계.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스_문제0 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		
		ArrayList<Integer> rtnList = new ArrayList<Integer>();
		Queue<Integer> list = new LinkedList<Integer>();
		for (int a = 1; a <=n; a++) {
			list.add(a);
		}
		
		
		while (!list.isEmpty()) {
			int pollCnt = 1;
			
				while(pollCnt != k) {
					pollCnt++;
					int pollData = list.poll();
					list.add(pollData);
				}
				rtnList.add(list.poll());
		}
		
		StringBuffer rtnValue = new StringBuffer();
		rtnValue.append("<");
		for (Integer integer : rtnList) {
			rtnValue.append(integer + ", ");
		}
		
		rtnValue.replace(rtnValue.length() - 2, rtnValue.length(), "");
		rtnValue.append(">");
		
		bw.write(new String(rtnValue));
		bw.flush();
		br.close();
		bw.close();
	}
}

