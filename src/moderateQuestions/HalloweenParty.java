package moderateQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HalloweenParty {
	
	public static void main(String[] args){
		int[] arr = {5,6,7,8};
		maxChocolates(arr);
	}
	 static void maxChocolates(int[] arr) {
	        for(int i=0;i<arr.length;i++){
	            int horizCut = arr[i]/2;
	            int vertiCut = arr[i] - horizCut;
	            long pieces = 1L*horizCut*vertiCut;
	            System.out.println(pieces);
	        }


	    }

}
