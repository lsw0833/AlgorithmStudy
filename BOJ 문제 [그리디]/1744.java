import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = 0;
		ArrayList<Integer> plus = new ArrayList<Integer>();
		ArrayList<Integer> minus = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			if(temp <= 0) {
				minus.add(temp);
			}else if(temp >=2) {
				plus.add(temp);
			}else {
				result+=temp;
			}
		}
		Collections.sort(minus);
		Collections.sort(plus, new Compare());
		
		for(int i=0; i<plus.size(); i+=2) {
			if(i+1 == plus.size()) {
				result+=plus.get(i);
			}else {
				result+=plus.get(i)*plus.get(i+1);
			}
		}
		for(int i=0; i<minus.size(); i+=2) {
			if(i+1 == minus.size()) {
				result+=minus.get(i);
			}else {
				result+=minus.get(i)*minus.get(i+1);
			}
		}
		System.out.println(result);
	}

}
class Compare implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		if(arg0 < arg1) {
			return 1;
		}else if(arg0 > arg1) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
