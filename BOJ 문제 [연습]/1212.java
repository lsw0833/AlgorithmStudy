import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = sc.nextLine();
		for(int i=0; i<input.length(); i++) {
			switch (input.charAt(i)) {
			case '0':
				sb.append("000");
				break;
			case '1':
				sb.append("001");
				break;
			case '2':
				sb.append("010");
				break;
			case '3':
				sb.append("011");
				break;
			case '4':
				sb.append("100");
				break;
			case '5':
				sb.append("101");
				break;
			case '6':
				sb.append("110");
				break;
			case '7':
				sb.append("111");
				break;
			}
		}
		if(sb.charAt(0)=='0') {
			sb.delete(0, 1);
		}
		if(sb.charAt(0)=='0') {
			sb.delete(0, 1);
		}
		System.out.println(sb);
	}

}
