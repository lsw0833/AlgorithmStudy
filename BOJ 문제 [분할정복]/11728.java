import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr1 = new int[N];
		int [] arr2 = new int[M];
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j=0; j<M; j++) {
			arr2[j] = sc.nextInt();
		}
		int i =0; 
		int j =0;
		while(true) {
			if(i<N && j<M) {
				if(arr1[i]<=arr2[j]) {
					System.out.print(arr1[i] + " ");
					i++;
				}else {
					System.out.print(arr2[j] + " ");
					j++;
				}
			}else if(i==N) {
				for(int k=j; k<M; k++) {
					System.out.print(arr2[k] + " ");
				}
				break;
			}else {
				for(int k=i; k<N; k++) {
					System.out.print(arr1[k] + " ");
				}
				break;
			}
			
		}
	}

}
