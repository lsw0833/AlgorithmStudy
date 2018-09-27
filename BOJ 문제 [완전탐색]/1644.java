import java.util.*;
public class Main {
	static boolean isPrime(int num) {
		for(int i=2; i<=Math.sqrt(num)+1; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<=N; i++) {
			if(isPrime(i)) {
				prime.add(i);
			}
		}
		int left = 0;
		int right = 0;
		int sum = 0;
		int cnt = 0;
		while(left<=right && (right <= prime.size()-1 || sum >= N)) {
			if(sum<N) {
				sum+=prime.get(right);
				right++;
			}else if(sum > N) {
				sum-=prime.get(left);
				left++;
			}else {
				cnt++;
				sum-=prime.get(left);
				left++;
			}
		}
		System.out.println(cnt);
	}

}
