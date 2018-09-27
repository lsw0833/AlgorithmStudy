import java.util.*;
public class Main {
	static void solve(int [][] map,int N, int M) {
		boolean [][] check = new boolean [M+1][N+1];
		PriorityQueue<Room> pq = new PriorityQueue<Room>();
		pq.add(new Room(1,1,0));
		check[1][1] = true;
		while(!pq.isEmpty()) {
			Room temp = pq.remove();
			if(temp.x == M && temp.y == N) {
				System.out.println(temp.AOJ);
			}
			if(temp.x-1 >=1 && !check[temp.x-1][temp.y]) {
				if(map[temp.x-1][temp.y]==1) {
					pq.add(new Room(temp.x-1,temp.y,temp.AOJ+1));
				}else {
					pq.add(new Room(temp.x-1,temp.y,temp.AOJ));
				}
				check[temp.x-1][temp.y] = true;
			}
			if(temp.x+1 <=M && !check[temp.x+1][temp.y]) {
				if(map[temp.x+1][temp.y]==1) {
					pq.add(new Room(temp.x+1,temp.y,temp.AOJ+1));
				}else {
					pq.add(new Room(temp.x+1,temp.y,temp.AOJ));
				}
				check[temp.x+1][temp.y] = true;
			}
			if(temp.y-1 >=1 && !check[temp.x][temp.y-1]) {
				if(map[temp.x][temp.y-1]==1) {
					pq.add(new Room(temp.x,temp.y-1,temp.AOJ+1));
				}else {
					pq.add(new Room(temp.x,temp.y-1,temp.AOJ));
				}
				check[temp.x][temp.y-1] = true;
			}
			if(temp.y+1 <=N && !check[temp.x][temp.y+1]) {
				if(map[temp.x][temp.y+1]==1) {
					pq.add(new Room(temp.x,temp.y+1,temp.AOJ+1));
				}else {
					pq.add(new Room(temp.x,temp.y+1,temp.AOJ));
				}
				check[temp.x][temp.y+1] = true;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int [][] map = new int [M+1][N+1];
		
		for(int i=1; i<=M; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=N; j++) {
				map[i][j] = str.charAt(j-1)-'0';
			}
		}
		
		solve(map,N,M);
	}

}
class Room implements Comparable<Room>{
	int x;
	int y;
	int AOJ;
	Room(int x, int y, int AOJ){
		this.x = x;
		this.y = y;
		this.AOJ = AOJ;
	}
	
	@Override
	public int compareTo(Room o) {
		// TODO Auto-generated method stub
		if(this.AOJ < o.AOJ) {
			return -1;
		}else if(this.AOJ > o.AOJ) {
			return 1;
		}else {
			return 0;
		}
	}
}