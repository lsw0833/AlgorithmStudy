import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			if(!hm.containsKey(temp)) {
				hm.put(temp, 1);
			}else {
				hm.replace(temp, hm.get(temp)+1);
			}
		}
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			int temp = sc.nextInt();
			if(hm.get(temp)==null) {
				System.out.print(0 + " ");
			}else {
				System.out.print(hm.get(temp) + " ");
			}
			
		}
	}
}
