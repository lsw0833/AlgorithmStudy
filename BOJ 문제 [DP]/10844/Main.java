import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] dp = new int[101][10];
		dp[1][0] = 0;
		for(int i=1; i<=9 ; i++) {
			dp[1][i] = 1;
		}
		for(int i=2; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][1]%1000000000;
				}else if(j==9) {
					dp[i][j] = dp[i-1][8]%1000000000;
				}else {
					dp[i][j] = (dp[i-1][j-1]+ dp[i-1][j+1])%1000000000;
				}
			}
		}
		long result = 0;
		for(int i=0; i<10; i++) {
			result += dp[N][i]%1000000000;
		}
		System.out.println(result%1000000000);
	}

}
