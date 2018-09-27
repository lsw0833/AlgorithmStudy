import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long M = sc.nextLong();
		
		int [] num = new int [N+1];
		
		for(int i=1; i<=N; i++) {
			num[i] = sc.nextInt();
		}
		int ans = 0;
		long temp = 0;
		for(int i=1; i<=N; i++) {
			temp = 0;
			for(int j=i; j<=N; j++) {
				temp += num[j];
				if(temp==M) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
