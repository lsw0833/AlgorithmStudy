import java.util.*;
public class Main {
	static int ans = 0;
	static void back(int [] num ,int S, int result, int start, int cnt) {
		if(result == S && cnt!=0) {
			ans++;
		}
		for(int i=start; i<=num.length-1; i++) {
			back(num,S,result+num[i],i+1,cnt+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int [] num = new int[N+1];
		for(int i=1; i<=N; i++) {
			num[i] = sc.nextInt();
		}
		back(num,S,0,1,0);
		System.out.println(ans);
	}
}
