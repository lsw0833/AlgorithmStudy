import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = false;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		long sum=0;
		for(int i=0; i<str.length(); i++) {
			arr.add(str.charAt(i)-'0');
			sum += str.charAt(i)-'0';
		}
		Collections.sort(arr);
		if(arr.get(0)==0 && sum %3 == 0) {
			for(int i=arr.size()-1; i>=0; i--) {
				System.out.print(arr.get(i));
			}
		}else {
			System.out.println(-1);
		}
		
	}

}
