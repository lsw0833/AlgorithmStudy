import java.util.*;
public class Main {
	static HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
	static void bfs(HashMap<Integer,ArrayList<Integer>> hm, boolean [] check) {
		int start = 1;
		check[start] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int temp = q.remove();
				for(int j : hm.get(temp)) {
					if(!check[j]) {
						check[j] = true;
						result.put(j, temp);
						q.add(j);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0; i<N; i++) {
			hm.put(i+1, new ArrayList<Integer>());
		}
		for(int i=1; i<=N-1; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			hm.get(v1).add(v2);
			hm.get(v2).add(v1);
		}
		boolean [] check = new boolean [N+1];
		bfs(hm,check);
		for(int i=2; i<=N; i++) {
			System.out.println(result.get(i));
		}
	}

}
