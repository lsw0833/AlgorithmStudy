import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int [][] sticker = new int [3][100001];
			for(int j=1; j<=2; j++) {
				for(int k=1; k<=N; k++) {
					sticker[j][k] = sc.nextInt();
				}
			}
			long [][]dp = new long [3][100001];
			dp[1][1] = sticker[1][1];
			dp[2][1] = sticker[2][1];
			dp[1][2] = sticker[1][2] + sticker[2][1];
			dp[2][2] = sticker[1][1] + sticker[2][2];
			for(int j=3; j<=N; j++) {
				dp[1][j] = sticker[1][j] + Math.max(dp[2][j-1], dp[2][j-2]);
				dp[2][j] = sticker[2][j] + Math.max(dp[1][j-1], dp[1][j-2]);
			}
			System.out.println(Math.max(dp[1][N], dp[2][N]));
		}
	}
}
