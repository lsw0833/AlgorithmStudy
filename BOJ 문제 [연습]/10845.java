import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			String cmd = sc.nextLine();
			String [] spl = cmd.split(" ");
			switch(spl[0]) {
			case "push":
				queue.add(Integer.parseInt(spl[1]));
				break;
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.remove());
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.peek());
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					Iterator<Integer> it = queue.iterator();
					int temp=0;
					while(it.hasNext()) {
						temp = it.next();
					}
					System.out.println(temp);
				}
				break;
			}
		}
	}

}
