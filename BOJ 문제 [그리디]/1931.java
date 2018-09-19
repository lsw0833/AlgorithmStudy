import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Meeting> m = new ArrayList<Meeting>();
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			m.add(new Meeting(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(m, new Compare());
		int now = m.get(0).end;
		int cnt = 1;
		
		for(int i=1; i<m.size(); i++) {
			Meeting temp = m.get(i);
			if(temp.start >= now) {
				now = temp.end;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
class Meeting{
	 int start;
	 int end;
	 Meeting(int s, int e){
		 start = s;
		 end = e;
	 }
}
class Compare implements Comparator<Meeting>{

	@Override
	public int compare(Meeting arg0, Meeting arg1) {
		// TODO Auto-generated method stub
		if(arg0.end < arg1.end) {
			return -1;
		}else if(arg0.end > arg1.end) {
			return 1;
		}else {
			if(arg0.start < arg1.start) {
				return -1;
			}else if(arg0.start > arg1.start) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
}