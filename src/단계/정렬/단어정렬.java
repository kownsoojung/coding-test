package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class 단어정렬 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		String[] list = new String[cnt];
		
		for (int a = 0; a < cnt; a++) {
			list[a] = br.readLine();
		}
		
		Arrays.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
	   	 			return s1.compareTo(s2);
	   	 		}else {
	   	 			return s1.length() - s2.length();
	   	 		}
			}
		});
		
		for (int a = 0; a < list.length; a++) {
			if (a == 0)System.out.println(list[a]);
			else {
				if ( !list[a-1].equals(list[a]) ) System.out.println(list[a]);
			}
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
