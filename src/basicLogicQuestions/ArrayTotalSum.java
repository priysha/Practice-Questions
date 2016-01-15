package basicLogicQuestions;
import java.util.*;

public class ArrayTotalSum {
	
	public static void main (String args[]){
		
		int[] a ={2,45,7,3,5,1,8,9};
		printSumPairs(a,10);
	}
	
	public static void printSumPairs(int[] a, int sum){
		Map<Integer, Integer> pair = new HashMap<Integer,Integer>();
		
		for(int i =0; i<a.length;i++){
			if(pair.containsKey(a[i])){
				System.out.println(a[i]+ " "+ pair.get(a[i]));
				
			}
			else 
				pair.put(sum - a[i], a[i]);
		}
	}

}
