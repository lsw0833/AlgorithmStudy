import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static void dq(int [][] v, int startx, int starty, int endx, int endy, int N) {
		boolean flag = false;
		int temp = v[startx][starty];
		for(int i=startx; i<=endx; i++) {
			for(int j=starty; j<=endy; j++) {
				if(v[i][j] !=temp) {
					flag = true;
				}
			}
			if(flag) {
				break;
			}
		}
		if(!flag) {
			sb.append(""+temp);
		}else {
			int next = N/2;
			sb.append("(");
			if(next==1) {
				for(int i=startx; i<=endx; i++) {
					for(int j=starty; j<=endy; j++) {
						sb.append(""+v[i][j]);
					}
				}
			}else {
				for(int i=startx; i<endx; i+=next) {
					for(int j=starty; j<endy; j+=next) {
						dq(v,i,j,i+next-1,j+next-1,next);
					}
				}
			}
			sb.append(")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int [][] video = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=N; j++) {
				video[i][j] = str.charAt(j-1)-48;
			}
		}
		dq(video,1,1,N,N,N);
		System.out.println(sb);
		
	}

}
