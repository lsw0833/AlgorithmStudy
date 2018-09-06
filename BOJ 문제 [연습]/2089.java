import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		StringBuilder sb = new StringBuilder();

		while(true) {
			sb.append(Math.abs(N%-2));
			N = (int)Math.ceil((double)N/-2);
			if(N==0) {
				break;
			}
		}
		System.out.println(sb.reverse());
	}

}
