import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int[1001];
		for(int i=1; i<=N; i++) {
			A[i] = sc.nextInt();
		}
		int [] dp = new int[1001];
		dp[1] = 1;
		int result = 1;
		for(int i=2; i<=N; i++) {
			
			int max = 1;
			for(int j=1; j<i; j++) {
				if(A[i]>A[j]) {
					max = Math.max(max, dp[j]+1);
				}
			}
			dp[i] = max;
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);
	}

}
