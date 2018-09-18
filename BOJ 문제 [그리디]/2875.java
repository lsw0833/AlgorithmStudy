import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int team = 0;
		while(N>=2 && M >=1) {
			N-=2;
			M-=1;
			team++;
		}
		int ing = N+M;
		K-=ing;
		while(K>0) {
			team--;
			K-=3;
		}
		System.out.println(team);
	}

}
