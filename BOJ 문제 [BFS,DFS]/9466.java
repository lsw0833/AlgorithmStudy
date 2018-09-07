import java.util.*;
public class Main {
	static int cycle(int [] st, int[] sv, int[] check, int v,int step) {
		int cnt = 1;
		while(true) {
			if(check[v]!=0) {
				if(sv[v]!=step) {
					return 0;
				}
				return cnt - check[v];
			}
			sv[v] = step;
			check[v] = cnt;
			v = st[v];
			cnt++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int [] st = new int[N+1];
			for(int j=1; j<=N; j++) {
				st[j] = sc.nextInt();
			}
			int [] team = new int[N+1];
			int [] check = new int[N+1];
			int result = 0;
			for(int j=1; j<=N; j++) {
					result += cycle(st,team,check,j,j);
			}
			
			System.out.println(N-result);
			
		}
	}

}
