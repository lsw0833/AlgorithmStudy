import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] a = new int [301];
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		int [] dp = new int [301];
		dp[1] = a[1];
		dp[2] = a[1] + a[2];
		dp[3] = Math.max(a[1] + a[3], a[2]+a[3]);
		for(int i=4; i<=N; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3]+a[i-1])+a[i];
		}
		System.out.println(dp[N]);
		
	}

}
