import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		System.out.print("<");
		while(!queue.isEmpty()) {
			for(int i=1; i<M; i++) {
				queue.add(queue.remove());
			}
			if(queue.size()==1)
				System.out.print(queue.remove());
			else 
				System.out.print(""+ queue.remove()+", ");
		}		
		System.out.println(">");
		
	}

}
