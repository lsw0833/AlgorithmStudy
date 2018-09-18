import java.util.*;
public class Main {
	static int [] arr;
	static int [] temp;
	static long cnt = 0;
	static void divide(int start, int end) {
		if(start == end) {
			return ;
		}
		int mid = (start+end)/2;
		divide(start, mid);
		divide(mid+1,end);
		conquer(start,end);
	}
	static void conquer(int start, int end) {
		int mid = (start+end)/2;
		int i =  start;
		int j = mid+1;
		int k = 1;
		while(i<=mid && j <= end) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}else if(arr[i] > arr[j]) {
				temp[k] = arr[j];
				j++;
				k++;
				cnt+=mid-i+1;
			}
		}
		while(j<=end) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		while(i<=mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		k = 1;
		for(int l=start; l<=end; l++) {
			arr[l] = temp[k];
			k++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int [N+1];
		temp = new int [N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = sc.nextInt();
		}
		divide(1,N);
		System.out.println(cnt);
	}

}
