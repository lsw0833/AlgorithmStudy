import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long B = sc.nextInt();
		char [] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D',
				'E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
				'S','T','U','V','W','X','Y','Z'};
		Stack <Character> stack = new Stack<Character>();
		long m;
		long k;
		while(true) {
			m = N%B;
			k = N/B;
			stack.push(c[(int) m]);
			N = k;
			if(k==0) {
				break;
			}
		}
		int temp = stack.size();
		for(int i=0; i<temp; i++) {
			System.out.print(stack.pop());
		}
	}

}
