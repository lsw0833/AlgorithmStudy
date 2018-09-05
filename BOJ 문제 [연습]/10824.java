import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] spl = str.split(" ");
		long num1 = Long.parseLong(spl[0]+spl[1]);
		long num2 = Long.parseLong(spl[2]+spl[3]);
		System.out.println(num1+num2);
	}

}
