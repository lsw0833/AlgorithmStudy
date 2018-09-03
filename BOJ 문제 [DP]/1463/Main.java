import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int [] dp= new int [1000001];
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		for(int i=4;i<=N; i++) {
			
			if(i%2==0 && i%3==0) { // 2,3모두로 나눠지는경우
				dp[i] = Math.min(dp[i/2], Math.min(dp[i/3], dp[i-1]))+1;
			}else if(i%2!=0&&i%3==0) { //3으로만
				dp[i] = Math.min(dp[i/3], dp[i-1])+1;
			}else if(i%2==0 && i%3!=0) {//2로만
				dp[i] = Math.min(dp[i/2], dp[i-1])+1;
			}else { // 2,3 모두 안나눠지는경우
				dp[i] = dp[i-1]+1;
			} 
		}
		System.out.println(dp[N]);
	}

}
