import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] dp = new long [1001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for(int i=4; i<=n; i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		System.out.println(dp[n]);
	}

}
