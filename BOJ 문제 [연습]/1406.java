import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		Stack<Character> head = new Stack<Character>();
		Stack<Character> tail = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			head.push(str.charAt(i));
		}
		for(int i=1; i<=N; i++) {
			String cmd =  br.readLine();
			String [] spl = cmd.split(" ");
			switch(spl[0]) {
			case "L":
				if(!head.isEmpty()) {
					char ch = head.pop();
					tail.push(ch);
				}
				break;
			case "D":
				if(!tail.isEmpty()) {
					char ch = tail.pop();
					head.push(ch);
				}
				break;
			case "B":
				if(!head.isEmpty()) {
					head.pop();
				}
				break;
			case "P":
				head.push(spl[1].charAt(0));
				break;
			}
		}
		int temp = head.size();
		for(int i=0; i<temp; i++) {
			tail.push(head.pop());
		}
		temp = tail.size();
		for(int i=0; i<temp; i++) {
			bw.write(tail.pop().toString());
		}
		bw.close();
		br.close();
	}
}
