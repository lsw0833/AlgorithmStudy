import java.util.*;
public class Main {
	static void bfs(String [] alpha, int L, int C) {
		Queue<String> q = new LinkedList<String>();
		for(int i=0; i<C; i++) {
			q.add(alpha[i]);
		}
		while(!q.isEmpty()) {
			String temp = q.remove();
			if(temp.length()==L) {
				int m_cnt = 0;
				int j_cnt = 0;
				for(int i=0; i<L; i++) {
					if(temp.charAt(i)=='a' ||temp.charAt(i)=='e'|| temp.charAt(i)=='i'|| temp.charAt(i)=='o'|| temp.charAt(i)=='u') {
						m_cnt++;
					}else {
						j_cnt++;
					}
				}
				if(m_cnt>=1 && j_cnt>=2) {
					System.out.println(temp);
				}
			}
			for(int i=0; i<C; i++) {
				if(alpha[i].charAt(0) > temp.charAt(temp.length()-1)) {
					q.add(temp+alpha[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		
		String str = sc.nextLine();
		
		String [] spl = str.split(" ");
		
		Arrays.sort(spl);
		bfs(spl,L,C);
	}

}
