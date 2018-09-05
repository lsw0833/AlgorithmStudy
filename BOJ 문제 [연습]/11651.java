import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList<Pointer> arr = new ArrayList<Pointer>();
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			arr.add(new Pointer(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(arr, new Ascending());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
class Pointer {
	int x;
	int y;
	Pointer(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return Integer.toString(x)+ " " + Integer.toString(y);
	}
}
class Ascending implements Comparator<Pointer> {

	@Override
	public int compare(Pointer o1, Pointer o2) {
		// TODO Auto-generated method stub
		if(o1.x == o2.x && o1.y == o2.y)
			return 0;
		if(o1.y == o2.y) {
			if(o1.x < o2.x) {
				return -1;
			}else {
				return 1;
			}
		}
		if(o1.y < o2.y) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
