import java.util.*;
public class Main {
	static int fac(int x) {
		if(x==0)
			return 1;
		return fac(x-1)*x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fac(N));
	}

}
