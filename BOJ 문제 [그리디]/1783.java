import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		if(N==1) {
			System.out.println(1);
		}else if(N==2) {
			for(int i=3; i<=M; i+=2) {
				cnt++;
			}
			if(cnt>=4) {
				System.out.println(4);
			}else {
				System.out.println(cnt+1);
			}
		}else {
			if(M>=7) {
				cnt = 4+M-7;
				System.out.println(cnt+1);
			}else {
				for(int i=2; i<=M; i++) {
					cnt++;
				}
				if(cnt>=4) {
					System.out.println(4);
				}else {
					System.out.println(cnt+1);
				}
			}
		}
	}

}
