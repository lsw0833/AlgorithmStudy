import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		for(int i=1; i<=N; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
