import java.util.*;
public class Main {
	static ArrayList<Integer> bfs(boolean [][] vertex, boolean [] check, int len, int start){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(!q.isEmpty()) {
			int temp = q.remove();
			result.add(temp);
			for(int i=1; i<=len; i++) {
				if(vertex[temp][i] && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
		Collections.sort(result);
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean [][] vertex = new boolean[N+1][N+1];
		for(int i=0; i<M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			vertex[v1][v2] = true;
			vertex[v2][v1] = true;
		}
		
		for(int i=1; i<=N; i++) {
			boolean [] check = new boolean[N+1];
			set.add(bfs(vertex,check,N,i));
		}
		System.out.println(set.size());
		
	}

}
