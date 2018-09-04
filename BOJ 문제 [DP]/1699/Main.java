import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] dp = new int[100001];
		dp[1] = 1;
		for(int i=2; i<=N; i++) {
			dp[i] = dp[i-1] +1;
			double temp = Math.sqrt(i);
			int temp2 = (int)temp;
			if(temp == temp2) {
				dp[i] = 1;
			}else {
				for(int j=2; j<Math.sqrt(i)+1; j++) {
					if(i-j*j>0) {
						dp[i] = Math.min(dp[i-j*j]+1, dp[i]);
					}
				}
			}
		}
		System.out.println(dp[N]);
	}

}
