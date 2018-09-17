import java.util.*;
public class Main {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int num, int first , int second , int third) {
		if(num==1) {
			sb.append(""+first + " " + third+"\n");
			cnt++;
		}else {
			hanoi(num-1,first,third,second);
			sb.append(""+first+ " "+ third+"\n");
			cnt++;
			hanoi(num-1,second,first,third);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		hanoi(N,1,2,3);
		System.out.println(cnt);
		System.out.println(sb);
	}

}
