import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int large = x > y ? x: y;
			int small = x < y ? x: y;
			while(true) {
				int temp = large % small;
				if(temp == 0) {
					System.out.println(small*(x/small)*(y/small));
					break;
				}else {
					large = small;
					small = temp;
				}
			}
		}
		
	}

}
