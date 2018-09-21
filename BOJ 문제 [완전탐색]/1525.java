import java.util.*;
public class Main {
	static void bfs(String start) {
		Queue<String> q = new LinkedList<String>();
		HashSet<String> hs = new HashSet<String>();
		
		q.add(start);
		hs.add(start);
		int result = 0;
		String target = "123456780";
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				String temp = q.remove();
				if(temp.equals(target)) {
					System.out.println(result);
					return;
				}
				
				int n = temp.indexOf('0');
				if(n%3!=0) {
					String str = "";
					for(int j=0; j<=n-2; j++) {
						str+=temp.charAt(j);
					}
					str+='0';
					str+=temp.charAt(n-1);
					for(int j=n+1; j<temp.length(); j++) {
						str+=temp.charAt(j);
					}
					if(!hs.contains(str)) {
						hs.add(str);
						q.add(str);
					}
				}
				if(n%3!=2) {
					String str = "";
					for(int j=0; j<=n-1; j++) {
						str+=temp.charAt(j);
					}
					str+=temp.charAt(n+1);
					str+='0';
					for(int j=n+2; j<temp.length(); j++) {
						str+=temp.charAt(j);
					}
					if(!hs.contains(str)) {
						hs.add(str);
						q.add(str);
					}
				}
				if(n-3>=0) {
					String str = "";
					for(int j=0; j<=n-4; j++) {
						str+=temp.charAt(j);
					}
					str+='0';
					for(int j=n-2; j<=n-1; j++) {
						str+=temp.charAt(j);
					}
					str+=temp.charAt(n-3);
					for(int j=n+1; j<temp.length(); j++) {
						str+=temp.charAt(j);
					}
					if(!hs.contains(str)) {
						hs.add(str);
						q.add(str);
					}
				}
				if(n+3<=8) {
					String str = "";
					for(int j=0; j<=n-1; j++) {
						str+=temp.charAt(j);
					}
					str+=temp.charAt(n+3);
					for(int j=n+1; j<=n+2; j++) {
						str+=temp.charAt(j);
					}
					str+='0';
					for(int j=n+4; j<temp.length(); j++) {
						str+=temp.charAt(j);
					}
					if(!hs.contains(str)) {
						hs.add(str);
						q.add(str);
					}
				}
				
			}
			result++;
			
		}
		System.out.println("-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				str+=""+sc.nextInt();
			}
		}
		bfs(str.trim());
		
	}

}

