import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		String str = Integer.toString(A);
		ArrayList<Long> list = new ArrayList<Long>();
		long result = 0;
		int cnt =0;
		list.add(Long.parseLong(str));
		while(true) {
			String num =list.get(cnt).toString();
			result = 0;
			for(int i=0; i<num.length(); i++) {
				int temp = num.charAt(i) - 48;
				result += Math.pow(temp, P);
			}
			if(list.contains(result)) {
				int size = 0;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i)!=result) {
						size++;
					}else {
						System.out.println(size);
						return;
					}
				}
			}
			list.add(result);
			cnt++;
			
		}
		
	}

}
