import java.math.BigInteger;
import java.util.*;

public class Main {
	static BigInteger fac(BigInteger x) {
		if(x.equals(BigInteger.ZERO))
			return BigInteger.valueOf(1);
		BigInteger t = x.subtract(BigInteger.valueOf(1));
		return fac(t).multiply(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger b = new BigInteger("0");
		String N = sc.nextLine();
		String str = fac(new BigInteger(N)).toString();
		int cnt = 0;
		int size = str.length()-1;
		while(true) {
			if(str.charAt(size)!='0') {
				break;
			}
			size--;
			cnt++;
		}
		System.out.println(cnt);
	}

}
