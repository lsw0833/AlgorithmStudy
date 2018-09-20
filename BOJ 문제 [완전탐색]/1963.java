import java.util.*;
public class Main {
	static HashSet<Integer> prime = new HashSet<Integer>();
	static int bfs(int N, int K) {
		int result = 0;
		HashSet<Integer> check = new HashSet<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(N);
		check.add(N);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int j = 0; j<len; j++) {
				int temp = q.remove();
				if(temp==K) {
					return result;
				}
				int one = temp/1000;
				int two = temp%1000/100;
				int three = temp%100/10;
				int four = temp%10;
				
				for(int i=1; i<=9; i++) {
					int dum = i*1000 + two*100 + three*10 + four;
					if(dum!=temp && !check.contains(dum) && prime.contains(dum)) {
						q.add(dum);
						check.add(dum);
					}
				}
				for(int i=0; i<=9; i++) {
					int dum = one*1000 + i*100 + three*10 + four;
					if(dum!=temp && !check.contains(dum) && prime.contains(dum)) {
						q.add(dum);
						check.add(dum);
					}
				}
				for(int i=0; i<=9; i++) {
					int dum = one*1000 + two*100 + i*10 + four;
					if(dum!=temp && !check.contains(dum) && prime.contains(dum)) {
						q.add(dum);
						check.add(dum);
					}
				}
				for(int i=0; i<=9; i++) {
					int dum = one*1000 + two*100 + three*10 + i;
					if(dum!=temp && !check.contains(dum) && prime.contains(dum)) {
						q.add(dum);
						check.add(dum);
					}
				}
			}
			result++;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=1000; i<=9999; i++) {
			boolean flag = false;
			for(int j=2; j<=Math.sqrt(i)+1; j++) {
				if(i%j==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime.add(i);
			}
		}
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int ans = bfs(N,K);
			if(ans == -1) {
				System.out.println("Impossible");
			}else {
				System.out.println(ans);
			}
		}
	}

}
