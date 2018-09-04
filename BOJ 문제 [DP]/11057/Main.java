import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = 10007;
		int [][] dp = new int[1001][10];
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		for(int i=2; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k]%m;
				}
			}
		}
		int result = 0;
		for(int i=0; i<=9; i++) {
			result += dp[N][i]%m;
		}
		System.out.println(result%m);
	}

}
