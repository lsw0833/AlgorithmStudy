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
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=N; i<=M; i++) {
			if(isPrime(i)) {
				bw.write(""+i+"\n");
			}
		}
		bw.close();
	}

}
