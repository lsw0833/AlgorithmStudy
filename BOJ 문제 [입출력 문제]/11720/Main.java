import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result = 0;
		sc.nextLine();
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			result += Integer.parseInt(Character.toString(str.charAt(i)));
		}
		System.out.println(result);
	}
}
