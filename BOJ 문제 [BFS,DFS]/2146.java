import java.util.*;
public class Main {
	static int result =1000000;
	static int cnt = 2;
	static void dfs(int [][] map, boolean[][] check,int I,int J, int N) {
		if(check[I][J]) {
			return ;
		}else {
			check[I][J] = true;
			map[I][J] = cnt;
			if(I+1<=N && map[I+1][J]==1) {
				dfs(map,check,I+1,J,N);
			}
			if(J+1<=N && map[I][J+1]==1) {
				dfs(map,check,I,J+1,N);
			}
			if(I-1>=0 && map[I-1][J]==1) {
				dfs(map,check,I-1,J,N);
			}
			if(J-1>=0 && map[I][J-1]==1) {
				dfs(map,check,I,J-1,N);
			}
		}
	}
	
	static void bfs(int [][] map, boolean [][] check,int I,int J,int N) {
		Queue<Point> q = new LinkedList<Point>();
		int re = 0;
		q.add(new Point(I,J));
		int num = map[I][J];
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Point temp = q.remove();
				if(map[temp.x][temp.y]!=0 && map[temp.x][temp.y]!=num) {
					if(result>re) {
						result = re;
					}
					return;
				}
				if(temp.x+1<=N && map[temp.x+1][temp.y]!=num && !check[temp.x+1][temp.y]) {
					check[temp.x+1][temp.y] = true;
					q.add(new Point(temp.x+1,temp.y));
				}
				if(temp.x-1>=0 && map[temp.x-1][temp.y]!=num && !check[temp.x-1][temp.y]) {
					check[temp.x-1][temp.y] = true;
					q.add(new Point(temp.x-1,temp.y));
				}
				if(temp.y+1<=N && map[temp.x][temp.y+1]!=num && !check[temp.x][temp.y+1]) {
					check[temp.x][temp.y+1] = true;
					q.add(new Point(temp.x,temp.y+1));
				}
				if(temp.y-1>=0 && map[temp.x][temp.y-1]!=num && !check[temp.x][temp.y-1]) {
					check[temp.x][temp.y-1] = true;
					q.add(new Point(temp.x,temp.y-1));
				}
			}
			re++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] map = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		boolean [][] check = new boolean[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(map[i][j]==1) {
					dfs(map,check,i,j,N);
					cnt++;
				}
			}
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(map[i][j]!=0) {
					check = new boolean[N+1][N+1];
					bfs(map,check,i,j,N);
				}
			}
		}
		if(result == 1000000) {
			System.out.println(0);
		}else {
			System.out.println(result-1);
		}
		
	}

}
class Point {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}