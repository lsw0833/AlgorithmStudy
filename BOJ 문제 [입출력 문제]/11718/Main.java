import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			if(str.trim().equals("")) {
				break;
			}
			System.out.println(str);
		}
		sc.close();
	}

}
