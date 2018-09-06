import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		boolean [] notPrime = new boolean [N+1];
		notPrime[0] = true;
		notPrime[1] = true;
		if(N==1) {
			return ;
		}
		for(int i=2; i<=N; i++) {
			if(notPrime[i]) {
				continue;
			}
			for(int j= i*2; j<=N; j+=i) {
				notPrime[j] = true;
			}
		}
		for(int i=1; i<=N; i++) {
			if(!notPrime[i]) {
				q.add(i);
			}
		}
		int temp = q.remove();
		while(N!=1) {
			if(N%temp==0) {
				System.out.println(temp);
				N/=temp;
			}else {
				temp = q.remove();
			}
		}
		
	}

}
