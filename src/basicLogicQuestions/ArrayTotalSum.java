package basicLogicQuestions;
import java.util.*;

public class ArrayTotalSum {
	
	public static void main (String args[]){
		
		//int[] a ={2,45,7,3,5,1,8,9};
		int[] a = {1,5,3,4,2};
		//printSumPairs(a,10);
		printDiffPairs(a,2);
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
	public static void printDiffPairs(int[]a,int d){
		Arrays.sort(a);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			map.put(a[i],1);
		}
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i]+d)){
				System.out.println(a[i]+" "+(a[i]+d));
				}
			//else if(map.containsKey(a[i]-d)){
			//	System.out.println(a[i]+" "+(a[i]-d));
			//	}	
			map.remove(a[i]);
			}
	}

}
