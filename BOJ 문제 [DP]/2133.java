import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] dp = new long[31];
		for(int i=1; i<=30; i+=2) {
			dp[i] = 0;
		}
		dp[2] = 3;
		dp[4] = 2 + dp[2]*3;
		for(int i=6; i<=30; i+=2) {
			dp[i] = dp[i-2]*3;
			for(int j=4; j<i; j+=2) {
				dp[i] += dp[i-j]*2;
			}
			dp[i] +=2;
		}
		System.out.println(dp[N]);
	}
}
