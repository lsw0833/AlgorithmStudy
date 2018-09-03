import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			String str = sc.nextLine();
			str = str.trim();
			String [] spl = str.split(",");
			System.out.println(Integer.parseInt(spl[0])+Integer.parseInt(spl[1]));
		}
	}
}
