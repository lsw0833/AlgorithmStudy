import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long K = sc.nextInt();
		long N = sc.nextInt();
		ArrayList<Long> line = new ArrayList<Long>();
		long max=0;
		for(long i=1; i<=K; i++) {
			long t = sc.nextLong();
			line.add(t);
			if(max<t) {
				max = t;
			}
		}
		
		long min = 1;
		
		long cnt = 0;
		while(max >= min) {
			long mid = (min + max)/2;
			cnt = 0;
			for(long i=0; i<line.size(); i++) {
				cnt+=line.get((int) i)/mid;
			}
			if(cnt >=N) {
				min = mid+1;
			}else {
				max = mid-1;
			}
		}
		System.out.println(max);
	}

}
