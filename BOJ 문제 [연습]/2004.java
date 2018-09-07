import java.util.*;

public class Main {
	static long findTwo(long n) {
		long cnt = 0;
		for(long i=2; i<=n; i*=2) {
			cnt+=n/i;
		}
		return cnt;
	}
	static long findFive(long n) {
		long cnt = 0;
		for(long i=5; i<=n; i*=5) {
			cnt+=n/i;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long result1 = findTwo(n) - findTwo(m) -findTwo(n-m);
		long result2 = findFive(n) - findFive(m) -findFive(n-m);
		System.out.println(Math.min(result1, result2));
	}

}
