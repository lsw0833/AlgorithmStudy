import java.util.*;
public class Main {
	static void DSLR(int N, int K) {
		Queue<Struct> q = new LinkedList<Struct>();
		HashSet<Integer> hs = new HashSet<Integer>();
		q.add(new Struct(N,""));
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Struct temp = q.remove();
				if(temp.x==K) {
					System.out.println(temp.path);
					return ;
				}
				int D = temp.x*2;
				if(D>9999) {
					D %=10000;
				}
				if(!hs.contains(D)) {
					q.add(new Struct(D,temp.path+"D"));
					hs.add(D);
				}
				int S = temp.x-1;
				if(S==-1) {
					S = 9999;
				}
				if(!hs.contains(S)) {
					q.add(new Struct(S,temp.path+"S"));
					hs.add(S);
				}
				int one = temp.x/1000;
				int two = temp.x%1000/100;
				int three = temp.x%100/10;
				int four = temp.x%10;
				int L = two*1000 + three*100+ four*10 + one;
				int R = four*1000 + one*100 + two*10 + three;
				if(!hs.contains(L)) {
					q.add(new Struct(L,temp.path+"L"));
					hs.add(L);
				}
				if(!hs.contains(R)) {
					q.add(new Struct(R,temp.path+"R"));
					hs.add(R);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			DSLR(sc.nextInt(),sc.nextInt());
		}
		
	}

}
class Struct {
	int x;
	String path;
	Struct(int x, String path){
		this.path = path;
		this.x = x;
	}
}