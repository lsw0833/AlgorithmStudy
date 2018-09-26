import java.util.*;
public class Main {
	static void solve(int [][] sdocu, int N, int M, int cnt) {
		if(cnt==0) {
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.print(sdocu[i][j]+ " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(sdocu[i][j]==0) {
					N = i;
					M = j;
					break;
				}
			}
		}
		boolean [] check = new boolean[10];
		for(int i=1; i<=9; i++) {
			check[sdocu[N][i]] = true;
		}
		for(int i=1; i<=9; i++) {
			check[sdocu[i][M]] = true;
		}
		for(int i=((N-1)/3)*3+1; i<=((N-1)/3)*3+1+2; i++) {
			for(int j=((M-1)/3)*3+1; j<=((M-1)/3)*3+1+2; j++) {
				check[sdocu[i][j]] = true;
			}
		}
		int temp=0;
		for(int i=1; i<=9; i++) {
			if(!check[i]) {
				temp++;
			}
		}
		if(temp==0) {
			return;
		}else {
			for(int i=1; i<=9; i++) {
				if(!check[i]) {
					sdocu[N][M] = i;
					solve(sdocu,N,M,cnt-1);
					sdocu[N][M] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] sdocu = new int [10][10];
		int cnt = 0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				sdocu[i][j] = sc.nextInt();
				if(sdocu[i][j]==0) {
					cnt++;
				}
			}
		}
		solve(sdocu,1,1,cnt);
		
		
	}

}
