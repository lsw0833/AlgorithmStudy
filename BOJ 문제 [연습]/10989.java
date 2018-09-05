import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int [] arr = new int [10001];
		for(int i=1; i<=N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		for(int i=1; i<=10000; i++) {
			for(int j=1; j<=arr[i]; j++) {
				sb.append(""+i+"\n");
			}
		}
		System.out.println(sb);
	
	}

}
