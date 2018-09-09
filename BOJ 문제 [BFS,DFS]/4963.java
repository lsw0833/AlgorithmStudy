import java.util.*;
public class Main {
	static int cnt = 0;
	static void dfs(boolean [][] map, boolean [][] check,int start1, int start2,int w, int h) {
		if(!map[start1][start2] || check[start1][start2]) {
			return;
		}else {
			check[start1][start2] = true;
			cnt++;
			// 왼쪽
			if(start1-1>=1)
				dfs(map,check,start1-1,start2,w,h);
			// 오른쪽
			if(start1+1<=h)
				dfs(map,check,start1+1,start2,w,h);
			// 위
			if(start2-1 >=1)
				dfs(map,check,start1,start2-1,w,h);
			// 아래
			if(start2+1<=w)
				dfs(map,check,start1,start2+1,w,h);
			if(start1-1>=1 && start2+1<=w)
				dfs(map,check,start1-1,start2+1,w,h);
			if(start1-1>=1 && start2-1>=1)
				dfs(map,check,start1-1,start2-1,w,h);
			if(start1+1<=h && start2-1>=1)
				dfs(map,check,start1+1,start2-1,w,h);
			if(start1+1<=h && start2+1<=w)
				dfs(map,check,start1+1,start2+1,w,h);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0) {
				break;
			}
			boolean [][] map = new boolean[h+1][w+1];
			
			for(int i=1; i<=h; i++) {
				for(int j=1; j<=w; j++) {
					int temp = sc.nextInt();
					if(temp == 1)
						map[i][j] = true;
				}
			}
			
			boolean [][] check = new boolean[h+1][w+1];
			int result = 0;
			for(int i=1; i<=h; i++) {
				for(int j=1; j<=w; j++) {
					if(map[i][j] && !check[i][j]) {
						dfs(map,check,i,j,w,h);
						if(cnt!=0) {
							cnt = 0;
							result++;
						}
					}
						
				}
			}
			System.out.println(result);
		}
	}

}
