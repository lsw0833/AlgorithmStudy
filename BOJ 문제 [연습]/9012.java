import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=T; i++) {
			String str = sc.nextLine();
			boolean flag = true;
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(ch == '(')
					stack.push(str.charAt(j));
				else {
					if(stack.isEmpty()) {
						flag = false;
					}else {
						stack.pop();
					}
				}
			}
			if(!flag || !stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			stack.clear();
		}
	}
}
