import java.util.*;
public class Main {
	static int time = 0;
	static boolean [] check = new boolean[100001];
	static void find(int N, int K) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(N);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				int temp = q.remove();
				if(temp == K) {
					return ;
				}
				if(temp+1 <= 100000 && !check[temp+1]) {
					check[temp+1] = true;
					q.add(temp+1);
				}
				if(temp-1 >=0 &&!check[temp-1]) {
					check[temp-1] = true;
					q.add(temp-1);
				}
				if(temp*2 <= 100000 &&!check[temp*2]) {
					check[temp*2] = true;
					q.add(temp*2);
				}
			}
			time++;
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		find(N,K);
		System.out.println(time);
		
	}

}
