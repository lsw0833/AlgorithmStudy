import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<Student> arr = new ArrayList<Student>();
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			String str = sc.nextLine();
			String [] spl = str.split(" ");
			arr.add(new Student(Integer.parseInt(spl[1]),Integer.parseInt(spl[2]),Integer.parseInt(spl[3]),spl[0]));
		}
		Collections.sort(arr, new Ascending());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
class Student {
	int korean;
	int english;
	int math;
	String name;
	
	Student(int k, int e, int m, String name){
		this.korean = k;
		this.english = e;
		this.math = m;
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
class Ascending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.korean != o2.korean) {
			if(o1.korean > o2.korean)
				return -1;
			else
				return 1;
		}else {
			if(o1.english != o2.english) {
				if(o1.english < o2.english)
					return -1;
				else
					return 1;
			}else {
				if(o1.math != o2.math) {
					if(o1.math > o2.math)
						return -1;
					else
						return 1;
				}else {
					return o1.name.compareTo(o2.name);
				}
			}
		}
	}
	
}
