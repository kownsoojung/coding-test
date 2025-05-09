package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class 나이순정렬 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		String[][] list = new String[cnt][2];
		
		for (int a = 0; a < cnt; a++) {
			list[a] = br.readLine().split(" ");
		}
		
		Arrays.sort(list, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// 
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		
		for (int a = 0; a < list.length; a++) {
			System.out.println(list[a][0] + " "+ list[a][1]);
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
