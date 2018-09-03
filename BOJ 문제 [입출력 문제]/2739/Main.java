import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=9; i++) {
			int temp = i*N;
			System.out.println(N+ " * " + i + " = " + temp);
		}
	}

}
