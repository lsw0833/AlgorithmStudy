import java.util.*;
public class Main {
	static int [][] square;
	static long sumSquare(int startx, int endx, int starty, int endy) {
		long result = 0;
		for(int i=startx; i<=endx; i++) {
			for(int j=starty; j<=endy; j++) {
				result += square[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long max = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		square = new int[N+1][M+1];
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				square[i][j+1] = str.charAt(j)-'0';
			}
		}
		//일자 가로로
		if(N>=3) {
			long first =0;
			long second = 0;
			long third = 0;
			for(int i=1; i<=N-2; i++) {
				first = sumSquare(1,i,1,M);
				for(int j=i+1; j<=N-1; j++) {
					second = sumSquare(i+1,j,1,M);
					third = sumSquare(j+1,N,1,M);
					long temp = first*second*third;
					if(temp > max) {
						 max = temp;
					}
				}
			}
		}
		//일자 세로
		if(M>=3) {
			long first =0;
			long second = 0;
			long third = 0;
			for(int i=1; i<=M-2; i++) {
				first = sumSquare(1,N,1,i);
				for(int j=i+1; j<=M-1; j++) {
					second = sumSquare(1,N,i+1,j);
					third = sumSquare(1,N,j+1,M);
					long temp = first*second*third;
					if(temp > max) {
						 max = temp;
					}
				}
			}
		}
		// T자 1
		if(M>=2 && N>=2) {
			long first =0;
			long second = 0;
			long third = 0;
			for(int i=1; i<=M-1; i++) {
				first = sumSquare(1,N,1,i);
				for(int j=1; j<=N-1; j++) {
					second = sumSquare(1,j,i+1,M);
					third = sumSquare(j+1,N,i+1,M);
					long temp = first*second*third;
					if(temp > max) {
						 max = temp;
					}
				}
			}
		}
		// T자 2
		if(M>=2 && N>=2) {
			long first =0;
			long second = 0;
			long third = 0;
			for(int i=1; i<=M-1; i++) {
				for(int j=1; j<=N-1; j++) {
					first = sumSquare(1,j,1,i);
					second = sumSquare(j+1,N,1,i);
					third = sumSquare(1,N,i+1,M);
					long temp = first*second*third;
					if(temp > max) {
						 max = temp;
					}
				}
			}
		}
		// T자 3
		if(M>=2 && N>=2) {
		long first =0;
		long second = 0;
		long third = 0;
			for(int i=1; i<=N-1; i++) {
				first = sumSquare(1,i,1,M);
				for(int j=1; j<=M-1; j++) {
					second = sumSquare(i+1,N,1,j);
					third = sumSquare(i+1,N,j+1,M);
					long temp = first*second*third;
					if(temp > max) {
						 max = temp;
					}
				}
			}
		}
		//T4
		if(M>=2 && N>=2) {
			long first =0;
			long second = 0;
			long third = 0;
				for(int i=1; i<=M-1; i++) {
					for(int j=1; j<=N-1; j++) {
						first = sumSquare(1,j,1,i);
						second = sumSquare(1,j,i+1,M);
						third = sumSquare(j+1,N,1,M);
						long temp = first*second*third;
						if(temp > max) {
							 max = temp;
						}
					}
				}
			}
		System.out.println(max);
	}
	
}
