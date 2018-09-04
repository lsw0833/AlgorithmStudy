import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] P = new int [10001];
		for(int i=1; i<=N; i++) {
			P[i] = sc.nextInt();
		}
		long [] dp = new long [1001];
		dp[1] = P[1];
		for(int i=2; i<=N; i++) {
			dp[i] = P[i];
			for(int j=1; j<i; j++) {
				dp[i] = Math.max(dp[i], dp[j]+P[i-j]);
			}
		}
		System.out.println(dp[N]);
	}

}
