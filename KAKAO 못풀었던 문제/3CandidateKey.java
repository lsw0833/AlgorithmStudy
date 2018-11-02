import java.util.*;

public class Main {
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	static boolean isUniq(String [] keys) {
		Set<String> set = new HashSet<String>();
		int len = keys.length;
		for(int i=0; i<len; i++) {
			set.add(keys[i]);
		}
		if(set.size() == len) {
			return true;
		}else {
			return false;
		}
	}
	static void dfs(String [][] relation,String [] result,int row,int col,int index,ArrayList<Integer> keyset) {
		for(int i=index; i<col; i++) {
			String [] keys = new String[row];
			keyset.add(i);
			for(int j=0; j<row; j++) {
				keys[j]+=result[j]+"_"+relation[j][i];
			}
			if(isUniq(keys)) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0; k<keyset.size(); k++) {
					temp.add(keyset.get(k));
				}
				ans.add(temp);
			}
			dfs(relation,keys,row,col,i+1,keyset);
			keyset.remove(keyset.size()-1);
		}
	}
	static boolean isPart(ArrayList<Integer> a, ArrayList<Integer> b) {
		int cnt = 0;
		for(int i=0; i<a.size(); i++) {
			int temp = a.get(i);
			for(int j=0; j<b.size(); j++) {
				if(b.get(j)==temp) {
					cnt++;
					break;
				}
			}
		}
		if(cnt == a.size()) {
			return true;
		}else {
			return false;
		}
	}
	static public int solution(String[][] relation) {
	        int answer = 0;
	        int row  = relation.length;
	        int col = relation[0].length;
	        String [] r = new String[row];
	        ArrayList<Integer> arr = new ArrayList<Integer>(); 
	        dfs(relation,r,row,col,0,arr);
	        int index = 0;
	        while(index<ans.size()) {
	        	ArrayList<Integer> temp = ans.get(index);
	        	for(int i=0; i<ans.size(); i++) {
	        		if(index == i) {
	        			continue;
	        		}else {
	        			if(isPart(temp,ans.get(i))) {
	        				if(index>i) {
	        					index--;
	        				}
	        				ans.remove(i);
	        				i--;
	        			}
	        		}
	        	}
	        	index++;
	        }
	        answer = ans.size();
	        return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] tc = {{"1","1","1","1"},{"2","3","2","2"},{"3","3","3","3"}
		,{"4","4","4","4"}};
		System.out.println(solution(tc));
	}

}
