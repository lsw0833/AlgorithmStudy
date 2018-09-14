import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		ArrayList<Integer> height = new ArrayList<Integer>();
		long min = 0; 
		long max = 0;
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			height.add(temp);
			if(max<temp) {
				max = temp;
			}
		}
		while(min <= max) {
			long woods = 0;
			long mid = (min+max)/2;
			
			for(int i=0; i<height.size(); i++) {
				long temp = (height.get(i)-mid);
				if(temp > 0) {
					woods+=temp;
				}
			}
			if(woods >= M) {
				min = mid +1;
			}else {
				max = mid -1;
			}
		}
		System.out.println(max);
	}

}
