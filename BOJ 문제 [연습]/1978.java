import java.util.*;
public class Main {
	static boolean isPrime(int x) {
		if(x==1) {
			return false;
		}
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(x); i++) {
			if(x%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result=0;
		for(int i=1; i<=N; i++) {
			if(isPrime(sc.nextInt())) {
				result++;
			}
		}
		System.out.println(result);
	}

}
