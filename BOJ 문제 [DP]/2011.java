import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int [] dp = new int [5001];
		int len = str.length();
		int m = 1000000;
		dp[1] = 1;
		if(str.substring(0,1).equals("0")) {
			System.out.println("0");
			return;
		}
		if(len == 1) {
			System.out.println("1");
			return;
		}
		if(Integer.parseInt(str.substring(1,2)) != 0) {
			dp[2] += dp[1];
		}
		if(Integer.parseInt(str.substring(0,2))<=26 && Integer.parseInt(str.substring(0,2))>=10) {
			dp[2] +=1;
		}
		for(int i=3; i<=len; i++) {
			if(Integer.parseInt(str.substring(i-1,i)) != 0) {
				dp[i] += dp[i-1]%m;
			}
			if(Integer.parseInt(str.substring(i-2,i))<=26 && Integer.parseInt(str.substring(i-2,i))>=10) {
				dp[i] += dp[i-2]%m;
			}
		}
//		for(int i=0; i<=len; i++) {
//			System.out.println(dp[i]);
//		}
		System.out.println(dp[len]%m);
	}

}
