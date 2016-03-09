package basicLogicQuestions;

import java.util.*;

public class OccursOnlyOnce {
	public static void main (String args[]){
		int[] arr = {2,2,2,3,3,3,3,3,4,4,5,5,6,6,1,1,1,3};
		int check = returnNumberOccursOnce(arr);
		if(check == -1){
		System.out.println("no number that occurs only once");
		}
		else System.out.println(check);
	}
	public static int returnNumberOccursOnce(int[] arr){
		Map<Integer, Integer> countMap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(countMap.containsKey(arr[i])){
				countMap.put(arr[i],countMap.get(arr[i])+1 );
			}
			else countMap.put(arr[i],1);
		}
		for(Integer i : countMap.keySet()){
			if(countMap.get(i)==1){
				return i;
			}
				
		}
		return -1;
	}

	

}
