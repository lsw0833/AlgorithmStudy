import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] result = new int [5];
		while(sc.hasNext()) {
			String str = sc.nextLine();
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(ch>='a' && ch <='z') {
					result[1]++;
				}else if(ch>='A' && ch <='Z') {
					result[2]++;
				}else if(ch>='0' && ch <='9') {
					result[3]++;
				}else if(ch==' ') {
					result[4]++;
				}
			}
			for(int i=1; i<=3; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println(result[4]);
			result[1] = 0;
			result[2] = 0;
			result[3] = 0;
			result[4] = 0;
			
		}
	}

}
