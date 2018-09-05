import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch <='z') {
				ch+=13;
				if(ch>'z') {
					ch-=26;
				}
			}else if(ch>='A' && ch <='Z') {
				ch+=13;
				if(ch>'Z') {
					ch-=26;
				}
			}
			result+=ch;
		}
		System.out.println(result);
	}

}
