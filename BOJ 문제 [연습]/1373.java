import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num2 = sc.nextLine();
		Stack <Integer> stack = new Stack<Integer>();
		Stack <Integer> stack1 = new Stack<Integer>();
		for(int i=0; i<num2.length(); i++) {
			stack.push((int)num2.charAt(i)-48);
		}
		while(!stack.isEmpty()) {
			int n1=0;
			int n2=0;
			int n3=0;
			if(!stack.isEmpty()) {
				n1 = stack.pop();
			}
			if(!stack.isEmpty()) {
				n2 = stack.pop();
			}
			if(!stack.isEmpty()) {
				n3 = stack.pop();
			}
			stack1.push(n1*1+n2*2+n3*4);
		}
		int temp = stack1.size();
		for(int i=0; i<temp; i++)
			System.out.print(stack1.pop());
	}

}
