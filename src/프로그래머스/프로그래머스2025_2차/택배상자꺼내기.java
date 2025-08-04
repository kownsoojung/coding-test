package 프로그래머스.프로그래머스2025_2차;
import java.io.IOException;

public class 택배상자꺼내기 {
	public static void main(String args[]) throws IOException {
		
		solution(13,3,6);
	}

	public static int solution(int n, int w, int num) {
        int answer = 0;
        
        // 총 높이 구함
        int height = (n/w) + ( n%w == 0 ? 0 : 1);
        
        // 상자 위치 배열 추가
        int[][] data = new int[height][w];
        
        int h = 0;    // 상자를 넣으면서 놓는 높이
        int numH = 0; // num에 위치하는 높이
        int numW = 0; // num에 위치하는 너비
        
        
        
        for (int i =0; i < n ;i++) {
            int wd = 0;
            int a= i+1;
            
            if (h%2 == 0) {
                wd = (a-1) % w;
            }
            else {
                wd = (w - ((a-1) % w)) -1;
            }
            
            data[h][wd] = a;
            
            // num 과 동일하면 해당 위치 저장
            if (a == num){
                numH = h;
                numW = wd;
            }
            
            if (a %w == 0) h++;
        }
        
        // 만약 맨 윗칸 num에 위치한너비가 0인 경우 -1
        if (data[height-1][numW] == 0) answer = height-1-numH;
        else {
            answer = height-numH;
        }
        
        return answer;
    }
}
