import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int [1001];
		for(int i=1; i<=N; i++) {
			A[i] = sc.nextInt();
		}
		int [] dp = new int [1001];
		int [] dp2 = new int [1001];
		dp[1] = 1;
		for(int i=2; i<=N; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(A[i] > A[j]) {
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}
		}
		dp2[N]=1;
		for(int i=N-1; i>=1; i--) {
			dp2[i] = 1;
			for(int j=N; j>i; j--) {
				if(A[i] > A[j]) {
					dp2[i] = Math.max(dp2[i],dp2[j]+1);
				}
			}
		}
		int result =0;
		for(int i=1; i<=N; i++) {
			result = Math.max(result, dp[i]+dp2[i]);
		}
		System.out.println(result -1);
	}

}
