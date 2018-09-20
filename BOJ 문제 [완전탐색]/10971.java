import java.util.*;
public class Main {
	static long result = -1;
	static void tsp(int [][] map, boolean [] check, int start, int cost, int N, int end) {
		if(start==end && check[end]) {
			for(int i=1; i<=N; i++) {
				if(!check[i]) {
					return ;
				}
			}
			if(result == -1) {
				result = cost;
			}else if(result > cost) {
				result = cost;
			}
		}
		for(int i=1; i<=N; i++) {
			if(map[start][i]!=0&& !check[i]) {
				check[i] = true;
				tsp(map,check,i,cost+map[start][i],N, end);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] map = new int [N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i=1; i<=N; i++) {
			boolean [] check = new boolean[N+1];
			tsp(map,check,i,0,N,i);
		}
		System.out.println(result);
	}
}
