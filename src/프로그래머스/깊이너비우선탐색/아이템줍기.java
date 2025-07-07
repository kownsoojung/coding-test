package 프로그래머스.깊이너비우선탐색;

public class 아이템줍기 {
	private static int[][] isRectangle;
	private static int nMin = 9999999;
	
	private static int[] x = {-1, 1, 0, 0};
	private static int[] y = {0, 0, -1, 1};
	
	public static void main(String args[]) {
		int[][] rectangle = new int[][] {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
		int characterX =1;
		int characterY =3;
		int itemX =7;
		int itemY =8;
		
		solution(rectangle, characterX, characterY, itemX,  itemY);
	}
	
	
	public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
        isRectangle = new int[102][102];
        
        for ( int a = 0; a < rectangle.length; a++ ) {
        	for (int x = rectangle[a][0] * 2; x <= rectangle[a][2] * 2; x++ ) {
        		for (int y = rectangle[a][1]* 2; y <= rectangle[a][3]* 2; y++) {
        			if (x == rectangle[a][0] * 2|| x == rectangle[a][2] * 2|| y == rectangle[a][1] * 2|| y == rectangle[a][3]* 2 ) {
        				if ( isRectangle[x][y] == 0) {
        					isRectangle[x][y] = 1;
        				}
        				
        			}
        			else {
        				isRectangle[x][y] = 2;
        			}
        		}
        	}
        }
        
   
        isRectangle[characterX*2][characterY*2] = 0;
        bfs(characterX* 2, characterY* 2, isRectangle, itemX* 2, itemY* 2);
        
        
        return nMin / 2;
    }

	private static void bfs(int characterX, int characterY, int[][] isRectangle2, int itemX, int itemY) {
		// TODO Auto-generated method stub
		
		if (characterX == itemX && characterY == itemY) {
			nMin = Math.min(nMin, isRectangle2[characterX][characterY]);
			
			return;
		}
		
		for (int a = 0; a < 4; a ++) {
			int nX = characterX + x[a];
			int nY = characterY + y[a];
			
			int[][] isRectangle3 = isRectangle2.clone();
			
			if (nX == itemX && nY == itemY) {
				
				isRectangle3[nX][nY] = 1;
			}
			if (nX > 0 && nY > 0 && nX < 103 && nY < 103 && isRectangle3[nX][nY] == 1 ) {
				isRectangle3[nX][nY] = isRectangle3[characterX][characterY]+1;
				
				bfs(nX, nY, isRectangle3, itemX, itemY);
				
			}
			
		}
		
	}
}

