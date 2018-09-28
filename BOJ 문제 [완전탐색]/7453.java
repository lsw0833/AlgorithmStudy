import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [] A = new int [N+1];
		int [] B = new int [N+1];
		int [] C = new int [N+1];
		int [] D = new int [N+1];
		
		for(int i=1; i<=N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		HashMap<Integer,Long> ab = new HashMap<Integer,Long>();
		HashMap<Integer,Long> cd = new HashMap<Integer,Long>();
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				int temp = A[i] + B[j];
				if(!ab.containsKey(temp)) {
					ab.put(temp, (long) 1);
				}else {
					ab.replace(temp, ab.get(temp)+1);
				}
			}
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				int temp = C[i] + D[j];
				if(!cd.containsKey(temp)) {
					cd.put(temp, (long) 1);
				}else {
					cd.replace(temp, cd.get(temp)+1);
				}
			}
		}
		Iterator<Integer> it = ab.keySet().iterator();
		long result=0;
		while(it.hasNext()) {
			int temp = it.next();
			if(cd.containsKey(temp*-1)) {
				result += ab.get(temp) * cd.get(temp*-1);
			}
		}
		System.out.println(result);
	}

}

