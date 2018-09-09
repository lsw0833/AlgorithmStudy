import java.util.*;

public class Main {
	static int cnt =0;
	static void bfs(int [][] map, boolean [][] check, int N, int M) {
		Queue <Point> q = new LinkedList<Point>();
		for(int i=1; i<=M; i++) {
			for(int j=1; j<=N; j++) {
				if(map[i][j]==1) {
					q.add(new Point(i,j));
					check[i][j] = true;
				}
			}
		}
		while(true) {
			int len = q.size();
			Point temp;
			for(int i=0; i<len; i++) {
				temp = q.remove();
				if(temp.x+1>=1 && temp.x+1<=M && map[temp.x+1][temp.y]==0 && !check[temp.x+1][temp.y]) {
					q.add(new Point(temp.x+1,temp.y));
					map[temp.x+1][temp.y] = 1;
					check[temp.x+1][temp.y] = true;
				}
				if(temp.x-1>=1 && temp.x-1<=M && map[temp.x-1][temp.y]==0 && !check[temp.x-1][temp.y]) {
					q.add(new Point(temp.x-1,temp.y));
					map[temp.x-1][temp.y] = 1;
					check[temp.x-1][temp.y] = true;
				}
				if(temp.y+1>=1 && temp.y+1<=N && map[temp.x][temp.y+1]==0 && !check[temp.x][temp.y+1]) {
					q.add(new Point(temp.x,temp.y+1));
					map[temp.x][temp.y+1] = 1;
					check[temp.x][temp.y+1] = true;
				}
				if(temp.y-1>=1 && temp.y-1<=N && map[temp.x][temp.y-1]==0 && !check[temp.x][temp.y-1]) {
					q.add(new Point(temp.x,temp.y-1));
					map[temp.x][temp.y-1] = 1;
					check[temp.x][temp.y-1] = true;
				}
			}
			if(q.size()==0) {
				break;
			}
			cnt++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [][] map = new int[M+1][N+1];
		
		for(int i=1; i<=M; i++) {
			for(int j=1; j<=N; j++) {
				int temp = sc.nextInt();
				map[i][j] = temp;
			}
		}
		boolean [][] check = new boolean[M+1][N+1];
		bfs(map,check,N,M);
		boolean flag = true;
		for(int i=1; i<=M; i++) {
			for(int j=1; j<=N; j++) {
				if(map[i][j] ==0) {
					System.out.println(-1);
					return ;
				}
			}
		}
		System.out.println(cnt);
		
	}
}
class Point	{	
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}