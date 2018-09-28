import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		Queue<Integer> A = new LinkedList<Integer>();
		Queue<Integer> B = new LinkedList<Integer>();
		int max_a = 0;
		int max_b = 0;
		for(int i=1; i<=M; i++) {
			int temp = sc.nextInt();
			A.add(temp);
			max_a+=temp;
		}
		for(int i=1; i<=N; i++) {
			int temp = sc.nextInt();
			B.add(temp);
			max_b+=temp;
		}
		HashMap<Integer,Long> a = new HashMap<Integer,Long>();
		HashMap<Integer,Long> b = new HashMap<Integer,Long>();
		a.put(0, (long) 1);
		b.put(0, (long) 1);
		
		for(int i=1; i<=M; i++) {
			int temp = 0;
			for(int j=1; j<=M; j++) {
				int dum = A.remove();
				temp+=dum;
				if(!a.containsKey(temp)) {
					a.put(temp, (long) 1);
				}else {
					a.replace(temp, a.get(temp)+1);
				}
				A.add(dum);
			}
			A.add(A.remove());
		}
		for(int i=1; i<=N; i++) {
			int temp = 0;
			for(int j=1; j<=N; j++) {
				int dum = B.remove();
				temp+=dum;
				if(!b.containsKey(temp)) {
					b.put(temp, (long) 1);
				}else {
					b.replace(temp, b.get(temp)+1);
				}
				B.add(dum);
			}
			B.add(B.remove());
		}
		a.replace(max_a, (long) 1);
		b.replace(max_b, (long) 1);
		long result = 0;
		Iterator<Integer> it = a.keySet().iterator();
		while(it.hasNext()) {
			int temp = it.next();
			if(b.containsKey(T-temp)) {
				result += a.get(temp)*b.get(T-temp);
			}
		}
		System.out.println(result);
	}

}
