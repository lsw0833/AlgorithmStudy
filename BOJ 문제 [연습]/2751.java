import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
