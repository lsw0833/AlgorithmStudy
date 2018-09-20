import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int year = 1;
		int e = 1;
		int s = 1;
		int m = 1;
		while(true) {
			if(e==E && s == S&& m == M) {
				break;
			}
			year++;
			e++;
			s++;
			m++;
			if(e>15) {
				e = 1;
			}
			if(s > 28) {
				s = 1;
			}
			if(m > 19) {
				m = 1;
			}
		}
		System.out.println(year);
	}

}
