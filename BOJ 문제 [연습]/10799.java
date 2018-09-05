import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String str = sc.nextLine();
		int result = 0;
		char prev = '!';
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}else {
				if(prev == '(') {
					stack.pop();
					result += stack.size();
				}else {
					stack.pop();
					result +=1;
				}
			}
			prev = ch;
		}
		System.out.println(result);
	}

}
