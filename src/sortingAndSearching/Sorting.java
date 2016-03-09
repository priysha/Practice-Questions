package sortingAndSearching;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String args[]){
		int[] arr = {1,2,6,4,5,3,6,8,5,9};
		int a =1;
		switch(a){
		case 1: bubbleSort(arr);
		
		case 2: insertionSort(arr);
		
		case 3: mergeSort(arr, 0, arr.length, 0);
		
		case 4: quickSort(arr);
		
		}
	}
	public static void bubbleSort(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for (int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
			System.out.println("Result of "+i+"th iteration: "+Arrays.toString(arr));
		}
	}
	public static void insertionSort(int[] arr){
		int temp;
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
			System.out.println("Result of "+i+"th iteration: "+Arrays.toString(arr));
		}
	}
	public static void mergeSort(int[] arr, int start, int end, int mid){
		mid = start + (end-start)/2;
		
		
		
	}
	public static void quickSort(int[] arr){
		
	}

}
