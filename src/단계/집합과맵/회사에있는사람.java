package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class 회사에있는사람 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> nSet = new HashSet<String>();
		
		for (int a = 0; a < n; a++) {
			String[] text = br.readLine().split(" ");
			
			if (text[1].equals("enter")) {
				nSet.add(text[0]);
			}
			else {
				nSet.remove(text[0]);
			}
		}
		
		List<String> list = new ArrayList<String>(nSet);
		
		list.sort(Comparator.reverseOrder());
		
		for (String name : list) {
			System.out.println(name);
			
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
