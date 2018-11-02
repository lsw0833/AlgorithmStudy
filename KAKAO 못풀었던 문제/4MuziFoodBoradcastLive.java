import java.util.*;
public class Main {
	
	static public int solution(int[] food_times, long k) {
		 int answer = 0;
	     long remain = food_times.length;
	     ArrayList<Food> food = new ArrayList<Food>();
	     long c = 0;
	     for(int i=0; i<remain; i++) {
	    	 food.add(new Food(i+1,food_times[i]));
	    	 c+=food_times[i];
	     }
	     if(c==k) {
	    	 return -1;
	     }
	     Collections.sort(food, new CompareAmount());
	     int i = 0;
	     long time = k;
	     long temp=0;
	     while(true) {
	    	 if(i==0) {
	    		 temp=food.get(i).amount*remain;
	    	 }else {
	    		 temp=(food.get(i).amount-food.get(i-1).amount)*remain;
	    	 }
	    	 if(time-temp<0) {
	    		 ArrayList<Integer> result = new ArrayList<Integer>();
	    		 for(int j=i; j<food.size(); j++) {
	    			 result.add(food.get(j).index);
	    		 }
	    		 Collections.sort(result);
	    		 int target = (int) (time%remain);
	    		 answer = result.get(target);
	    		 break;
	    	 }else if(time-temp==0) {
	    		 ArrayList<Integer> result = new ArrayList<Integer>();
	    		 for(int j=i+1; j<food.size(); j++) {
	    			 result.add(food.get(j).index);
	    		 }
	    		 Collections.sort(result);
	    		 if(result.size()==0) {
	    			 answer = -1;
	    		 }else {
	    			 answer = result.get(0);
	    		 }
	    		 break;
	    	 }else {
	    		 time -= temp;
	    		 remain--;
	    		 i++;
	    		 if(i==food.size()) {
	    			 answer = -1;
	    			 break;
	    		 }
	    	 }
	     }
	     return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,1};
		System.out.println(solution(arr,3));
		System.out.println("?");
	}

}
class Food {
	int index;
	int amount;
	Food(int index, int amount){
		this.index = index;
		this.amount = amount;
	}
}
class CompareAmount implements Comparator<Food>{
	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.amount - o2.amount;
	}
}