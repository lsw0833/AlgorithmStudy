import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long card;
		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
		for(int i=1; i<=N; i++) {
			card = sc.nextLong();
			if(map.get(card)==null) {
				map.put(card, 1);
			}else {
				map.put(card, map.get(card)+1);
			}
		}
		int max = 0;
		long key = 0;
		Set<Entry<Long, Integer>> set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Long, Integer> e = (Entry<Long, Integer>) it.next();
			if(e.getValue()>max) {
				max = e.getValue();
				key = e.getKey();
			}else if(e.getValue() == max && e.getKey()<key) {
				key = e.getKey();
			}
		}
		System.out.println(key);
	}
	
}
