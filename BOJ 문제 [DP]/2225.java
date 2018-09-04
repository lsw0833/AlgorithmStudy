import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long [][] dp = new long[201][201];
		for(int i=0; i<=200; i++) {
			dp[i][1] = 1;
			dp[0][i] = 1;
		}
		for(int i=1; i<=200; i++) {
			for(int j=2; j<=200; j++) {
				for(int k=i; k>=0; k--) {
					dp[i][j] += dp[k][j-1]%1000000000; 
				}
			}
		}
//		for(int i=0; i<=200; i++) {
//			for(int j=0; j<=200; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[N][K]%1000000000);
	}
}
