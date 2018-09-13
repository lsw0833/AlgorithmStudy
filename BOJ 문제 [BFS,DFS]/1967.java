import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	static int resultLen=0;
	static int resultVertex = 0;

	static void dfs(HashMap<Integer,ArrayList<bridge>> hm,boolean [] check, bridge start) {
		check[start.x] = true;
		boolean flag = false;
		for(bridge b : hm.get(start.x)) {
			if(!check[b.x]) {
				flag = true;
				dfs(hm,check,new bridge(b.x,b.weigth+start.weigth));
			}
		}
		if(!flag) {
			if(resultLen<start.weigth) {
				resultLen = start.weigth;
				resultVertex = start.x;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer,ArrayList<bridge>> hm = new HashMap<Integer,ArrayList<bridge>>();
		for(int i=1; i<=N; i++) {
			hm.put(i, new ArrayList<bridge>());
		}
		for(int i=1; i<=N-1; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int w = sc.nextInt();
			hm.get(v1).add(new bridge(v2,w));
			hm.get(v2).add(new bridge(v1,w));
		}
		boolean [] check = new boolean[N+1];
		dfs(hm,check,new bridge(1,0));
		check = new boolean[N+1];
		dfs(hm,check,new bridge(resultVertex,0));
		System.out.println(resultLen);
	}
}
class bridge {
	int x;
	int weigth;
	bridge(int x, int w){
		this.x = x;
		this.weigth = w;
	}
}
