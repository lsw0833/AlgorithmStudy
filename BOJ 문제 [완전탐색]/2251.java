import java.util.*;
public class Main {
	static TreeSet<Integer> result = new TreeSet<Integer>();
	static void bfs(Bottle bo,int sa, int sb, int sc) {
		Queue<Bottle> q = new LinkedList<Bottle>();
		HashSet<Bottle> hs = new HashSet<Bottle>();
		q.add(bo);
		hs.add(bo);
		int a;
		int b;
		int c;
		Bottle nb;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Bottle temp = q.remove();
				if(temp.a == 0) {
					result.add(temp.c);
				}
				a = temp.a;
				b = temp.b;
				c = temp.c;
				a += c;
				c = 0;
				if(a>sa) {
					c = a - sa;
					a = sa;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
				
				a = temp.a;
				b = temp.b;
				c = temp.c;
				b += c;
				c = 0;
				if(b>sb) {
					c = b - sb;
					b = sb;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
				
				a = temp.a;
				b = temp.b;
				c = temp.c;
				c += b;
				b = 0;
				if(c>sc) {
					b = c - sc;
					c = sc;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
				
				a = temp.a;
				b = temp.b;
				c = temp.c;
				c += a;
				a = 0;
				if(c>sc) {
					a = c - sc;
					c = sc;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
				
				a = temp.a;
				b = temp.b;
				c = temp.c;
				a += b;
				b = 0;
				if(a>sa) {
					b = a - sa;
					a = sa;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
				
				a = temp.a;
				b = temp.b;
				c = temp.c;
				b += a;
				a = 0;
				if(b>sb) {
					a = b - sb;
					b = sb;
				}
				nb = new Bottle(a,b,c);
				if(!hs.contains(nb)) {
					hs.add(nb);
					q.add(nb);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		bfs(new Bottle(0,0,c),a,b,c);
		
		Iterator<Integer> it =result.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
	}

}
class Bottle {
	int a;
	int b;
	int c;
	Bottle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Bottle temp = (Bottle)obj;
		if(this.a==temp.a && this.b == temp.b && this.c == temp.c) {
			return true;
		}
		return false;
	}
}