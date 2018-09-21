import java.util.*;
public class Main {
	static boolean isConnect(Rect a, Rect b) {
		int a_minx = a.x1 < a.x2 ? a.x1 : a.x2;
		int a_maxx = a.x1 > a.x2 ? a.x1 : a.x2;
		int a_miny = a.y1 < a.y2 ? a.y1 : a.y2;
		int a_maxy = a.y1 > a.y2 ? a.y1 : a.y2;
		
		int b_minx = b.x1 < b.x2 ? b.x1 : b.x2;
		int b_maxx = b.x1 > b.x2 ? b.x1 : b.x2;
		int b_miny = b.y1 < b.y2 ? b.y1 : b.y2;
		int b_maxy = b.y1 > b.y2 ? b.y1 : b.y2;
		
		if(b_maxx < a_minx ||a_maxx < b_minx) {
			return false;
		}
		if(b_maxy < a_miny ||a_maxy < b_miny) {
			return false;
		}
		if(a_minx < b_minx && b_maxx < a_maxx && a_miny < b_miny && b_maxy < a_maxy) {
			return false;
		}
		if(b_minx < a_minx && a_maxx < b_maxx && b_miny < a_miny && a_maxy < b_maxy) {
			return false;
		}
		return true;
	}
	static int result = 0;
	static void dfs(HashMap<Integer,ArrayList<Integer>> hm,boolean [] check, int start,int N) {
		check[start] = true;
		
		for(int i : hm.get(start)) {
			if(check[i]==false) {
				
				dfs(hm,check,i,N);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Rect [] r = new Rect[N+1];
		for(int i=1; i<=N; i++) {
			r[i] = new Rect(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=1; i<=N; i++) {
			hm.put(i, new ArrayList<Integer>());
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i!=j && isConnect(r[i],r[j])) {
					hm.get(i).add(j);
				}
			}
		}
		boolean [] check = new boolean [N+1];
		for(int i=1; i<=N; i++) {
			if(!check[i]) {
				dfs(hm,check,i,N);
				result++;
			}
			
		}
		boolean flag = true;
		Rect t = new Rect(0,0,0,0);
		for(int i=1; i<=N; i++) {
			if(isConnect(t, r[i])) {
				flag = false;
			}
		}
		if(!flag) {
			result-=1;
		}
		System.out.println(result);
	}

}
class Rect{
	int x1;
	int y1;
	int x2;
	int y2;
	
	Rect(int a, int b, int c, int d){
		if(a<c) {
			x1 = a;
			y1 = b;
			x2 = c;
			y2 = d;
		}else {
			x1 = c;
			y1 = d;
			x2 = a;
			y2 = b;
		}
	}
}
