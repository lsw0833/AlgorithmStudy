import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String [] spl = str.split(" ");
		int N = Integer.parseInt(spl[0]);
		int M = Integer.parseInt(spl[1]);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int target = 0;
		for(int i=1; i<=N; i++) {
			arr.add(i);
		}
		bw.write("<");
		while(!arr.isEmpty()) {
			target+=M-1;
			if(target>=arr.size()) {
				target%=arr.size();
			}
			if(arr.size()!=1)
				bw.write(""+arr.get(target)+ ", ");
			else 
				bw.write(""+arr.get(target));
			arr.remove(target);
		}		
		bw.write(">");
		br.close();
		bw.close();
		
	}

}
