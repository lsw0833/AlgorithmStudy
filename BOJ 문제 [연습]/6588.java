import java.util.*;
import java.io.*;
public class Main {
	static boolean isPrime(int x) {
		if(x==1) {
			return false;
		}
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(x); i++) {
			if(x%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			if(N==0) {
				break;
			}
			int temp = N-1;
			while(true) {
				if(isPrime(temp) && isPrime(N-temp)) {
					System.out.println("" + N + " = " + (N-temp) + " + " + temp);
					break;
				}
				temp -=2;
				if(temp < (int)N/2) {
					System.out.println("Goldbach's conjecture is wrong.");
					break;
				}
			}
		}
	}

}
