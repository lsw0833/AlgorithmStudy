import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> coin = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			coin.add(sc.nextInt());
		}
		int result = 0;
		int i = coin.size()-1;
		while(true) {
			int temp = coin.get(i);
			int cnt = K/temp;
			K = K-cnt*temp;
			result+= cnt;
			i--;
			if(K==0) {
				System.out.println(result);
				break;
			}
		}
	}

}
