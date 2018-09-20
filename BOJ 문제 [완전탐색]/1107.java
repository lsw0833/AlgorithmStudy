import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] broken = new int [M];
		for(int i=0; i<M; i++) {
			broken[i] = sc.nextInt();
		}
		boolean [] ben = new boolean[10];
		for(int i=0; i<M; i++) {
			ben[broken[i]] = true;
		}
		int cnt1 = 666666;
		int cnt2 = 666666;
		int cnt3 = 666666;
		cnt1 = Math.abs(N - 100);
		for(int i=N; i<=999999; i++) {
			
			boolean flag = false;
			int len = (int)Math.log10(i) + 1;
			if(i == 0) {
				len = 1;
			}
			for(int j=10; j<=Math.pow(10,len); j*=10) {
				if(ben[i%j/(j/10)]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt2 = len + Math.abs(N-i);
				break;
			}
		}
		for(int i=N; i>=0; i--) {
			boolean flag = false;
			int len = (int)Math.log10(i) + 1;
			if(i == 0) {
				len = 1;
			}
			for(int j=10; j<=Math.pow(10,len); j*=10) {
				if(ben[i%j/(j/10)]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt3 = len + Math.abs(N-i);
				break;
			}
		}
		System.out.println(Math.min(cnt1, Math.min(cnt2, cnt3)));
	}
}
