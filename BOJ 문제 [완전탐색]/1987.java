import java.util.*;
public class Main {
	static int ans = 0;
	static void dfs(char [][] map,boolean [] check, int x, int y,int R, int C, int cnt) {
		if(x-1 >=1 && !check[map[x-1][y]-'A']) {
			check[map[x-1][y]-'A'] = true;
			dfs(map,check,x-1,y,R,C,cnt+1);
			check[map[x-1][y]-'A'] = false;
		}
		if(x+1 <=R && !check[map[x+1][y]-'A']) {
			check[map[x+1][y]-'A'] = true;
			dfs(map,check,x+1,y,R,C,cnt+1);
			check[map[x+1][y]-'A'] = false;
		}
		if(y-1 >=1 && !check[map[x][y-1]-'A']) {
			check[map[x][y-1]-'A'] = true;
			dfs(map,check,x,y-1,R,C,cnt+1);
			check[map[x][y-1]-'A'] = false;
		}
		if(y+1<=C && !check[map[x][y+1]-'A']) {
			check[map[x][y+1]-'A'] = true;
			dfs(map,check,x,y+1,R,C,cnt+1);
			check[map[x][y+1]-'A'] = false;
		}
		if(cnt>ans) {
			ans = cnt;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char [][] map = new char[R+1][C+1];
		for(int i=1; i<=R; i++) {
			String input = sc.nextLine();
			for(int j=1; j<=C; j++) {
				map[i][j]=input.charAt(j-1);
			}
		}
		boolean [] check = new boolean[26];
		check[map[1][1]-'A'] = true;
		dfs(map,check,1,1,R,C,1);
		System.out.println(ans);
	}

}
