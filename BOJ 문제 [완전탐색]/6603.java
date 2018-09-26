import java.util.*;
public class Main {
	static void back(int [] num, int [] lotto, int N, int index, int start) {
		if(index == 7) {
			String str = "";
			for(int i=1; i<=6; i++) {
				str += "" + lotto[i] + " ";
			}
			System.out.println(str);
			return;
		}
		for(int i=start; i<=N; i++) {
			lotto[index] = num[i];
			back(num,lotto,N,index+1,i+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] lotto = new int[7];
		while(true) {
			int N = sc.nextInt();
			if(N==0) {
				break;
			}
			int [] num = new int[N+1];
			for(int i=1; i<=N; i++) {
				num[i] = sc.nextInt();
			}
			
			back(num,lotto,N,1,1);
			System.out.println();
		}
	}

}
