package basicLogicQuestions;

public class MaximumSubArray {
	public static void main(String args[]){
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5,4};
		int sum = maxSubArraySum(arr);
		System.out.println(sum);
	}
	public static int maxSubArraySum(int[] a){
		int max = a[0];
		int[] sum = new int [a.length];
		sum[0] = a[0];
		for(int i=1;i<a.length;i++){
			sum[i]= Math.max(a[i], sum[i-1]+a[i]);
			max = Math.max(max, sum[i]);
		}
		
		return max;
	}

}
