import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] dp = new long[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		for(int i=5; i<=100; i++) {
			dp[i] = dp[i-2]+dp[i-3];
		}
		for(int i=1; i<=n; i++) {
			int temp = sc.nextInt();
			System.out.println(dp[temp]);
		}
	}

}
