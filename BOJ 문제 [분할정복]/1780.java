import java.util.*;
public class Main {
	static int cnt1,cnt0,cntm1;
	static void dq(int [][] paper, int startx, int starty, int endx, int endy,int N) {
		boolean flag = false;
		int temp = paper[startx][starty];
		for(int i=startx; i<=endx; i++) {
			for(int j=starty; j<=endy; j++) {
				if(paper[i][j] != temp) {
					flag  = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		if(!flag) {
			if(temp==0) {
				cnt0++;
			}else if(temp==1) {
				cnt1++;
			}else {
				cntm1++;
			}
		}else {
			int dum = N/3;
			if(dum==1) {
				for(int i=startx; i<=endx; i++) {
					for(int j=starty;j<=endy; j++) {
						if(paper[i][j]==0) {
							cnt0++;
						}else if(paper[i][j]==1) {
							cnt1++;
						}else {
							cntm1++;
						}
					}
				}
			}else {
				for(int i=startx; i<endx; i+=dum) {
					for(int j=starty;j<endy; j+=dum) {
						dq(paper,i,j,i+dum-1,j+dum-1,dum);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [][] paper = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		dq(paper,1,1,N,N,N);
		System.out.println(cntm1);
		System.out.println(cnt0);
		System.out.println(cnt1);
	}

}
