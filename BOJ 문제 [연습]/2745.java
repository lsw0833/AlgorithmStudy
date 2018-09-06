import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String [] spl = N.split(" ");
		N = spl[0];
		int B = Integer.parseInt(spl[1]);
		long result =0;
		
		
		for(int i=N.length()-1; i>=0; i--) {
			char temp = N.charAt(i);
			int num=0;
			if(temp>='A' && temp<='Z') {
				num  = temp-55;
			}else if(temp>='0'&& temp<='9') {
				num = temp -48;
			}
			result+= num*Math.pow(B, N.length()-i-1);
		}
		System.out.println(result);
	}

}
