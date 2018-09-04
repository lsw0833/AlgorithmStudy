import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [100001];
		for(int i=1; i<=n; i++) {
			arr[i]= sc.nextInt();
		}
		int [] dp = new int [100001];
		dp[1] = arr[1];
		for(int i=2; i<=n; i++) {
			dp[i] = Math.max(arr[i],dp[i-1]+arr[i]);
		}
		int result = -10000;
		for(int i=1; i<=n; i++) {
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);
	}
}
// 이걸 어케생각해내.. ㅁㅊ 