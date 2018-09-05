import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> deque = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=N; i++) {
			String cmd = sc.nextLine();
			String [] spl = cmd.split(" ");
			switch(spl[0]) {
			case "push_front":
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(Integer.parseInt(spl[1]));
				for(int k=0; k<deque.size(); k++) {
					temp.add(deque.get(k));
				}
				deque = temp;
				break;
			case "push_back":
				deque.add(Integer.parseInt(spl[1]));
				break;
			case "pop_front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.remove(0));
				}
				break;
			case "pop_back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.remove(deque.size()-1));
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.get(0));
				}
				break;
			case "back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.get(deque.size()-1));
				}
				break;
			}
		}
	}

}
