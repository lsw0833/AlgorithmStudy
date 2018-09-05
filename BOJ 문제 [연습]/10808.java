import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] alpha = new int [27];
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
				alpha[1]++;
				break;
			case 'b':
				alpha[2]++;
				break;
			case 'c':
				alpha[3]++;
				break;
			case 'd':
				alpha[4]++;
				break;
			case 'e':
				alpha[5]++;
				break;
			case 'f':
				alpha[6]++;
				break;
			case 'g':
				alpha[7]++;
				break;
			case 'h':
				alpha[8]++;
				break;
			case 'i':
				alpha[9]++;
				break;
			case 'j':
				alpha[10]++;
				break;
			case 'k':
				alpha[11]++;
				break;
			case 'l':
				alpha[12]++;
				break;
			case 'm':
				alpha[13]++;
				break;
			case 'n':
				alpha[14]++;
				break;
			case 'o':
				alpha[15]++;
				break;
			case 'p':
				alpha[16]++;
				break;
			case 'q':
				alpha[17]++;
				break;
			case 'r':
				alpha[18]++;
				break;
			case 's':
				alpha[19]++;
				break;
			case 't':
				alpha[20]++;
				break;
			case 'u':
				alpha[21]++;
				break;
			case 'v':
				alpha[22]++;
				break;
			case 'w':
				alpha[23]++;
				break;
			case 'x':
				alpha[24]++;
				break;
			case 'y':
				alpha[25]++;
				break;
			case 'z':
				alpha[26]++;
				break;
			}
		}
		for(int i=1; i<=25; i++) {
			System.out.print(alpha[i]+ " ");
		}
		System.out.println(alpha[26]);
	}

}
