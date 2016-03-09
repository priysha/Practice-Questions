package sortingAndSearching;

import java.util.Arrays;

public class BinarySearch {
	
public static void main(String args[]){
		
		int[] arr = {1,2,6,4,5,3,6,8,5,9};
		int key= 9;
		Arrays.sort(arr);
		int index = returnIndexOfKey(arr,key);
		if(index == -1) System.out.println(key + " not found");
		else System.out.println(key + "is located at "+ index+ "in sorted array");
		
	}
	public static int returnIndexOfKey (int[] array, int key){
	int low = 0;
	int high = array.length - 1;
	while (low<=high){
		int mid =low+ (high - low)/2;
		if (array[mid]>key) high=mid-1;
		else if (array[mid]<key) low=mid+1;
		else return mid;
	}
	return -1;
	}

}
