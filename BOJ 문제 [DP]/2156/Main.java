import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] input = new int[10001];
		for(int i=1; i<=n;i++) {
			input[i] = sc.nextInt();
		}
		long [] dp = new long[10001];
		dp[1] = input[1];
		dp[2] = input[1]+input[2];
		dp[3] = Math.max(dp[2], Math.max(input[1]+input[3], input[2]+input[3]));
		for(int i=4; i<=n; i++) {
			dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+input[i], dp[i-3] + input[i-1] + input[i]));
		}
		System.out.println(dp[n]);
	}

}
