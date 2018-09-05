import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<Client> arr = new ArrayList<Client>();
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			String [] spl = str.split(" ");
			arr.add(new Client(Integer.parseInt(spl[0]),spl[1],cnt++));
		}
		Collections.sort(arr, new Ascending());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
class Client {
	int age;
	String name;
	int count;
	Client(int age, String name, int count){
		this.age = age;
		this.name = name;
		this.count = count;
	}
	public String toString() {
		return Integer.toString(age) + " " + this.name;
	}
}
class Ascending implements Comparator<Client>{

	@Override
	public int compare(Client o1, Client o2) {
		// TODO Auto-generated method stub
		if(o1.age == o2.age) {
			if(o1.count<o2.count) {
				return -1;
			}else {
				return 1;
			}
		}
		if(o1.age<o2.age) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
