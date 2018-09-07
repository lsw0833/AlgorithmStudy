import java.util.*;
public class Main {
	static void dfs(HashMap <Integer,ArrayList<Integer>> hm, boolean [] check,int len, int start) {
		check[start] = true;
		for(int v : hm.get(start)) {
			if(!check[v]) {
				dfs(hm,check,len,v);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int [] arr = new int[N+1];
			for(int j=1; j<=N; j++) {
				arr[j] = sc.nextInt();
			}
			HashMap <Integer,ArrayList<Integer>> hm = new HashMap<>();
			for(int j=0; j<=N; j++) {
				hm.put(j, new ArrayList<Integer>());
			}
			for(int j=1; j<=N; j++) {
				hm.get(j).add(arr[j]);
				hm.get(arr[j]).add(j);
			}
			boolean [] check = new boolean [N+1];
			int cnt =0;
			for(int j=1; j<=N; j++) {
				if(!check[j]) {
					dfs(hm,check,N,j);
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
