import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		long result = 0;
		for(int i=0; i<N; i++) {
			result+=arr.get(i)*(N-i);
		}
		System.out.println(result);
	}

}
