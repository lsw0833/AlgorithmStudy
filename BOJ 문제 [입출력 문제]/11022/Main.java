import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int temp = i+1;
			int result = A+B;
			System.out.println("Case #" + temp +  ": " + A + " + " + B + " = " + result);
		}
	}
}

