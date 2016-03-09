package basicLogicQuestions;
import java.util.*;
import java.util.Scanner;

public class MostFrequentInteger {
	
	public static void main (String args[]){
		int[] array = {1,1,3,5,5,5,7,1};
		int m = getMostPopUsingHash(array);//getMostPopularElement(array);
		System.out.println(m);
		
	}
	public static int getMostPopularElement(int[] a){
		int previous = a[0];
		int count = 1;
		int mostPopElement = a[0];
		int maxCount = 1;
		Arrays.sort(a);
		for (int i=1; i< a.length ; i++){
			if (a[i]==previous)
				count ++;
			else {
				if (count > maxCount){
					maxCount = count;
					mostPopElement = a[i-1];
				}
				previous = a[i];
				count = 1;
			}
			
		}
		return count > maxCount ? a[a.length -1]: mostPopElement; 
		
	}
	public static int getMostPopUsingHash(int[] a){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else map.put(a[i],1);
		}
		int ans=0;
		int max=0;
		
		for(Integer i: map.keySet()){
			if(map.get(i)>max){
				ans = i;
				max=map.get(i);
			}
			
		}
		return ans;
	}
	

}
