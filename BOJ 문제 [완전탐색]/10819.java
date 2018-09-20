import java.util.*;
public class Main {
	static boolean next_dic (int [] arr) {
		int len = arr.length;
		int k=-1;
		for(int i=0; i<len-1; i++) {
			if(arr[i]<arr[i+1]) {
				k=i;
			}
		}
		if(k==-1) {
			return false;
		}
		int l=-1;
		for(int i=k+1; i<len; i++) {
			if(arr[i] > arr[k]) {
				l=i;
			}
		}
		swap(arr,k,l);
		reverse(arr,k+1);
		return true;
	}
	static void swap(int [] arr ,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
	static void reverse(int [] arr, int i) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int j=i; j<arr.length; j++) {
			temp.add(arr[j]);
		}
		int size = temp.size()-1;
		for(int j=i; j<arr.length; j++) {
			arr[j] = temp.get(size);
			size--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long result = 0;
		while(true) {
			long temp = 0;
			for(int i=0; i<N-1; i++) {
				temp += Math.abs(arr[i]-arr[i+1]);
			}
			if(result < temp) {
				result = temp;
			}
			if(!next_dic(arr)) {
				break;
			}
		}
		System.out.println(result);
	}

}
