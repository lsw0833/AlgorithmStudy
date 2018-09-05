import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<xy> arr = new ArrayList<xy>();
		for(int i=1; i<=N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new xy(x,y));
		}
		Collections.sort(arr, new xyAsec());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
		
	}
	

}
class xy {
	xy(int x, int y){
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
	public String toString() {
		return Integer.toString(x) + " " +Integer.toString(y);
	}
}
class xyAsec implements Comparator<xy>{

	@Override
	public int compare(xy arg0, xy arg1) {
		// TODO Auto-generated method stub
		if(arg0.x==arg1.x) {
			if(arg0.y<arg1.y)
				return -1;
			else 
				return 1;
		}
		if(arg0.x<arg1.x)
			return -1;
		else 
			return 1;
	}
	
}