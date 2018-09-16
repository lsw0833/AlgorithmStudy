import java.util.*;
public class Main {
	static void isThere(int [] card, int find) {
		int len = card.length;
		int max = len -1;
		int min = 0;
		while(min <= max) {
			int mid = (min + max)/2;
			
			if(card[mid]==find) {
				System.out.print(1 + " ");
				return ;
			}else if(card[mid]<find) {
				min = mid +1;
			}else {
				max = mid -1;
			}
		}
		System.out.print(0 + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] card = new int [N];
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		int M = sc.nextInt();
		for(int i=1; i<=M; i++) {
			isThere(card,sc.nextInt());
		}
	}

}
