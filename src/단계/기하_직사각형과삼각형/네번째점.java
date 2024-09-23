package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 네번째점 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		String a1 = br.readLine();
		String a2 = br.readLine();
		String a3 = br.readLine();
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		map1.put(Integer.parseInt(a1.split(" ")[0]), map1.getOrDefault(Integer.parseInt(a1.split(" ")[0]), 0) +1);
		map1.put(Integer.parseInt(a2.split(" ")[0]), map1.getOrDefault(Integer.parseInt(a2.split(" ")[0]), 0) +1);
		map1.put(Integer.parseInt(a3.split(" ")[0]), map1.getOrDefault(Integer.parseInt(a3.split(" ")[0]), 0) +1);

		map2.put(Integer.parseInt(a1.split(" ")[1]), map2.getOrDefault(Integer.parseInt(a1.split(" ")[1]), 0) +1);
		map2.put(Integer.parseInt(a2.split(" ")[1]), map2.getOrDefault(Integer.parseInt(a2.split(" ")[1]), 0) +1);
		map2.put(Integer.parseInt(a3.split(" ")[1]), map2.getOrDefault(Integer.parseInt(a3.split(" ")[1]), 0) +1);
		
		int rValue1 = 0;
		int rValue2 = 0;
		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			if (entry.getValue() == 1 ) {
				rValue1 = entry.getKey();
				break;
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
			if (entry.getValue() == 1 ) {
				rValue2 = entry.getKey();
				break;
			}
		}
		
		bw.write(rValue1 + " " + rValue2);
		
		bw.flush();
		br.close();
		bw.close();
	}	
}


