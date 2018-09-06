import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int large = a > b ? a : b;
		int small = a < b ? a : b;
		int L;
		while(true) {
			int temp = large % small;
			if(temp == 0) {
				L = small;
				System.out.println(L);
				System.out.println(L*(a/L)*(b/L));
				break;
			}else{
				large = small;
				small = temp;
			}
		}
		
	}

}
