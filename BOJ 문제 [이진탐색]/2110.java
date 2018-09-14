import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<Long> house = new ArrayList<Long>();
		
		for(int i=0; i<N; i++) {
			house.add(sc.nextLong());
		}
		Collections.sort(house);
		long min = 1;
		long max = house.get(house.size()-1) - house.get(0);
		int cnt = 0;
		long result = 0;
		while(min <= max) {
			long mid = (max+min)/2;
			cnt = 1;
			long start = house.get(0);
			for(int i=1; i<N; i++) {
				long dist = house.get(i) - start;
				if(dist>=mid) {
					cnt++;
					start = house.get(i);
				}
			}
			if(cnt >= C) {
				result = mid;
				min = mid+1;
			}else if(cnt < C){
				max = mid -1;
			}
		}
		System.out.println(result);
	}

}
