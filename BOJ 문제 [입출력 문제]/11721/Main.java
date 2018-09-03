import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = 10;
		while(true){
			if(str.length() < len) {
				System.out.println(str.substring(len-10,str.length()));
				break;
			}
			System.out.println(str.substring(len-10,len));
			len+=10;
		}
	}
}
