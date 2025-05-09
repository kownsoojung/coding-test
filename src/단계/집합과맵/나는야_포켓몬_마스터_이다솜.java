package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class 나는야_포켓몬_마스터_이다솜 {
	

	
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		String regex = "[0-9]+";
		
		HashMap<String, Integer> mapS = new HashMap<String, Integer>();
		HashMap<Integer, String> mapN = new HashMap<Integer, String>();
		
		for (int a = 0; a < n; a++) {
			String text = br.readLine();
			mapS.put(text, a+1);
			mapN.put(a+1, text);
		}
		
		for (int a = 0; a < m; a++) {
			String data = br.readLine();
			
			if (data.matches(regex)){
				System.out.println(mapN.get(Integer.parseInt(data)));
			}
			else {
				System.out.println(mapS.get(data));
			}
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
