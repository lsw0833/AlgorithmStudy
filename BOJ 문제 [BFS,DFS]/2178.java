import java.util.*;
public class Main {
	static int cnt = 1;
	static void bfs(int [][] map, boolean[][] check,int N,int M) {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1,1));
		Point temp;
		check[1][1] = true;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				temp = q.remove();
				if(temp.x==N && temp.y ==M) {
					return ;
				}
				if(temp.x+1>=1 && temp.x+1<=N && map[temp.x+1][temp.y]==1 && !check[temp.x+1][temp.y]) {
					q.add(new Point(temp.x+1,temp.y));
					check[temp.x+1][temp.y] = true;
				}
				if(temp.x-1>=1 && temp.x-1<=N && map[temp.x-1][temp.y]==1 && !check[temp.x-1][temp.y]) {
					q.add(new Point(temp.x-1,temp.y));
					check[temp.x-1][temp.y] = true;
				}
				if(temp.y+1>=1 && temp.y+1<=M && map[temp.x][temp.y+1]==1 && !check[temp.x][temp.y+1]) {
					q.add(new Point(temp.x,temp.y+1));
					check[temp.x][temp.y+1] = true;
				}
				if(temp.y-1>=1 && temp.y-1<=M && map[temp.x][temp.y-1]==1 && !check[temp.x][temp.y-1]) {
					q.add(new Point(temp.x,temp.y-1));
					check[temp.x][temp.y-1] = true;
				}
			}
			
			cnt++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int [][] maze = new int [N+1][M+1];
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=M; j++) {
				maze[i][j] = str.charAt(j-1)-48;
			}
		}
		boolean [][] check = new boolean [N+1][M+1];
		bfs(maze,check,N,M);
		System.out.println(cnt);
	}

}
class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}