import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int m = sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack <Integer> stack = new Stack<Integer>();
		long dec = 0;
		
		for(int i=0; i<m; i++) {
			stack.push(sc.nextInt());
		}
		int cnt = 0;
		
		while(!stack.isEmpty()) {
			dec += stack.pop()*Math.pow(A, cnt);
			cnt++;
		}
		stack.clear();
		while(true) {
			stack.push((int)dec%B);
			dec = dec/B;
			if(dec==0) {
				break;
			}
		}
		while(!stack.isEmpty()) {
			bw.write(""+stack.pop()+ " ");
		}
		bw.close();
	}

}
