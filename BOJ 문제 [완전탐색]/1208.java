import java.util.*;
public class Main {
	static HashMap<Integer,Long> down = new HashMap<Integer,Long>(); 
	static HashMap<Integer,Long> up = new HashMap<Integer,Long>(); 
	static void back(HashMap<Integer,Long> hm, ArrayList<Integer> arr , int result, int start) {
		if(!hm.containsKey(result)) {
			hm.put(result, (long) 1);
		}else {
			hm.replace(result, hm.get(result)+1);
		}
		for(int i=start; i<arr.size(); i++) {
			back(hm,arr,result+arr.get(i),i+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> u = new ArrayList<Integer>();
		for(int i=0; i<N/2; i++) {
			u.add(sc.nextInt());
		}
		for(int i=N/2; i<N; i++) {
			d.add(sc.nextInt());
		}
		Collections.sort(d);
		Collections.sort(u);
		back(down,d,0,0);
		back(up,u,0,0);
		long result = 0;
		Iterator<Integer> it = down.keySet().iterator();
		while(it.hasNext()) {
			int temp = it.next();
			if(up.containsKey(S-temp)) {
				result += down.get(temp)*up.get(S-temp);
			}
		}
		if(S==0) {
			result--;
		}
		System.out.println(result);
	}
}

