import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] result = new int [12];
		result[1] = 1;
		result[2] = 2;
		result[3] = 4;
		for(int i=4; i<12; i++) {
			result[i] = result[i-1] + result[i-2] + result[i-3];
		}
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			System.out.println(result[sc.nextInt()]);
		}
	}
}
