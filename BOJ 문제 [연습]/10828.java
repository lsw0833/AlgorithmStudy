import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for(int i =1; i<=N; i++) {
			String cmd = sc.nextLine();
			String [] spl = cmd.split(" ");
			if(spl[0].equals("push")) {
				stack.push(Integer.parseInt(spl[1]));
			}else if(spl[0].equals("pop")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.pop());
				}
			}else if(spl[0].equals("size")) {
				System.out.println(stack.size());
			}else if(spl[0].equals("empty")) {
				if(stack.empty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(spl[0].equals("top")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}
		}
	}

}
