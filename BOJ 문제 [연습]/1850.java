import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		long large = x > y ? x: y;
		long small = x < y ? x: y;
		
		while(true) {
			long temp = large % small;
			if(temp == 0) {
				for(int i=0; i<small; i++) {
					bw.write("1");
				}
				break;
			}else {
				large = small;
				small = temp;
			}
		}
		bw.close();
	
	}

}
