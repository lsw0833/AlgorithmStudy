import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] alpha = new int [27];
		for(int i=1; i<=26; i++) {
			alpha[i] = -1;
		}
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			int num = str.charAt(i) - 96;
			if(alpha[num]==-1) {
				alpha[num] = i;
			}
		}
		for(int i=1; i<=25; i++) {
			System.out.print(alpha[i]+ " ");
		}
		System.out.println(alpha[26]);
	}

}
