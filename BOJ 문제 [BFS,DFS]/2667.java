import java.util.*;
public class Main {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int cnt =0;
	static void find(boolean [][] map, boolean [][] check, int start1, int start2,int N) {
		if(!map[start1][start2] || check[start1][start2]) {
			check[start1][start2] = true;
			return ;
		}else {
			check[start1][start2]=true;
			cnt++;
			if(start1+1<=N) {
				find(map,check,start1+1,start2,N);
			}
			if(start1-1>=1) {
				find(map,check,start1-1,start2,N);
			}
			if(start2+1<=N){
				find(map,check,start1,start2+1,N);
			}
			if(start2-1>=1) {
				find(map,check,start1,start2-1,N);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		boolean [][] map = new boolean[N+1][N+1];
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=N; j++) {
				if(str.charAt(j-1)=='1') {
					map[i][j] = true;
				}
			}
		}
		boolean [][] check = new boolean[N+1][N+1]; 
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(!check[i][j] || map[i][j]) {
					find(map,check,i,j,N);
					if(cnt != 0)
						arr.add(cnt);
					cnt = 0;
				}				
			}
		}
		Collections.sort(arr);
		System.out.println(arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
