import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> tail = new ArrayList<String>();
		for(int i=0; i<str.length(); i++) {
			tail.add(str.substring(i, str.length()));
		}
		Collections.sort(tail);
		for(int i=0; i<tail.size(); i++) {
			System.out.println(tail.get(i));
		}
	}

}
