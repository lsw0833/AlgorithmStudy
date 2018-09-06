import java.util.*;
public class Main {
	static int gcd(int x, int y) {
		int large = x>y ? x:y;
		int small = x<y ? x:y;
		while(true) {
			int temp = large % small;
			if(temp == 0) {
				return small;
			}else {
				large = small;
				small = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			long result = 0;
			for(int j=0; j<N; j++) {
				if(j==0) {
					arr.add(sc.nextInt());
				}else {
					int temp = sc.nextInt();
					for(int k=0; k<arr.size(); k++) {
						result+=gcd(temp,arr.get(k));
					}
					arr.add(temp);
				}
			}
			System.out.println(result);
			arr.clear();
		}
	}

}
