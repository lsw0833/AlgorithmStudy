import java.util.*;
public class Main {

	static void dfs(boolean [][] v, int len, int start, boolean [] check) {
		check[start] = true;
		System.out.print(start+ " ");
		for(int i=1; i<=len; i++) {
			if(!check[i] && v[start][i]) {
				dfs(v,len,i,check);
			}
		}
	}
	static void bfs(boolean [][] v, int start, boolean[] check, int len) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		while(!q.isEmpty()) {
			int temp = q.remove();
			System.out.print(temp + " ");
			for(int i=1; i<=len; i++) {
				if(v[temp][i] && !check[i]) {
					q.add(i);
					check[i] = true;
				}
					
					
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int V = sc.nextInt();
		
		boolean [][] vertex = new boolean[1001][1001];
		for(int i=0; i<M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			vertex[v1][v2] = true;
			vertex[v2][v1] = true;
		}
		boolean [] check = new boolean [N+1];
		
		
		
		dfs(vertex,N,V,check);
		boolean [] check1 = new boolean [N+1];
		System.out.println();
		bfs(vertex,V,check1,N);
	}
	
}
