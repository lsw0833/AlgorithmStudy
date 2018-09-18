import java.util.*;
public class Main {
	static int result = 0;
	static ArrayList<Point> p = new ArrayList<Point>();
	static TreeSet<Point> t = new TreeSet<Point>(new sortbyy());
	static int dist(Point p1, Point p2) {
		int result = (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			p.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(p, new sortbyx());
		result = dist(p.get(0),p.get(1));
		t.add(p.get(0));
		t.add(p.get(1));
		int start = 0;
		for(int i=2; i<n; i++) {
			Point pivot = p.get(i);
			// x
			while(start<i) {
				int len = pivot.x - p.get(start).x;
				if(len*len > result) {
					t.remove(p.get(start));
					start++;
				}else {
					break;
				}
			}
			// y
			Set <Point> s = t.subSet(new Point(0,pivot.y-result), new Point(0,pivot.y+result));
			Iterator<Point> it = s.iterator();
			while(it.hasNext()) {
				Point temp = it.next();
				int d = dist(temp,pivot);
				if(d < result) {
					result = d;
				}
			}
			t.add(pivot);
		}
		System.out.println(result);
	}
	
}
class Point {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class sortbyx implements Comparator<Point> {
	@Override
	public int compare(Point arg0, Point arg1) {
		// TODO Auto-generated method stub
		if(arg0.x < arg1.x) {
			return -1;
		}else if(arg0.x > arg1.x){
			return 1;
		}else {
			return 0;
		}
	}
	
}
class sortbyy implements Comparator<Point> {
	@Override
	public int compare(Point arg0, Point arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.y < arg1.y) {
			return -1;
		}else if(arg0.y > arg1.y){
			return 1;
		}else {
			if(arg0.x < arg1.x) {
				return -1;
			}else if (arg0.x > arg1.x){
				return 1;
			}else {
				return 0;
			}
		}
	}
	
}