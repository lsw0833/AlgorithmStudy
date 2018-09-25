import java.util.*;
public class Main {
	static void bfs(int F, int S, int G, int U, int D) {
		int cnt = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		boolean [] check = new boolean[F+1];
		check[S] = true;
		q.add(S);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int temp = q.remove();
				if(temp == G) {
					System.out.println(cnt);
					return ;
				}
				if(temp+U<=F && !check[temp+U]) {
					q.add(temp+U);
					check[temp+U] = true;
				}
				if(temp-D >=1 && !check[temp-D]) {
					q.add(temp-D);
					check[temp-D] = true;
				}
			}
			cnt++;
		}
		System.out.println("use the stairs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt();
		int S = sc.nextInt();
		int G = sc.nextInt();
		int U = sc.nextInt();
		int D = sc.nextInt();
		
		bfs(F,S,G,U,D);
	}

}
