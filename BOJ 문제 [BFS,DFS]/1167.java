import java.util.*;
public class Main {
	static int resultLen=0;
	static int resultVertex = 0;
//	static void bfs(HashMap<Integer,ArrayList<bridge>> hm, boolean [] check, int N, int start) {
//		Queue<bridge> q = new LinkedList<bridge>();
//		q.add(new bridge(start,0));
//		check[start] = true;
//		while(!q.isEmpty()) {
//			bridge temp = q.remove();
//			int tempVertex = temp.x;
//			int tempWeight = temp.weigth;
//			boolean flag = false;
//			for(int j=1; j<=N; j++) {
//				for(bridge b : hm.get(tempVertex)) {
//					if(!check[b.x]) {
//						flag = true;
//						check[b.x] = true;
//						q.add(new bridge(b.x,tempWeight+b.weigth));
//					}
//				}
//			}
//			if(!flag) {
//				if(resultLen<tempWeight) {
//					resultLen = tempWeight;
//					resultVertex = tempVertex;
//				}
//			}
//			
//		}
//	}
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
		sc.nextLine();
		HashMap<Integer,ArrayList<bridge>> hm = new HashMap<Integer,ArrayList<bridge>>();
		for(int i=1; i<=N; i++) {
			hm.put(i, new ArrayList<bridge>());
		}
		for(int i=1; i<=N; i++) {
			String temp = sc.nextLine();
			String [] spl = temp.split(" ");
			int cnt1 = 1;
			int cnt2 = 2;
			int v1 = Integer.parseInt(spl[0]);
			while(true) {
				int v2 = Integer.parseInt(spl[cnt1]);
				if(v2 == -1) {
					break;
				}
				int len = Integer.parseInt(spl[cnt2]);
				hm.get(v1).add(new bridge(v2,len));
				cnt1+=2;
				cnt2+=2;
			}
		}
		boolean [] check = new boolean[N+1];
		//bfs(hm,check,N,1);
		dfs(hm,check,new bridge(1,0));
		
		check = new boolean[N+1];
		dfs(hm,check,new bridge(resultVertex,0));
		//bfs(hm,check,N,resultVertex);
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
