package basicLogicQuestions;

public class ArrayPrimeIntegers {
	public static void main(String args[]){
		int[] arr = {15,21,7,6,8,22};
		int[] primeArray = returnPrimeFactorCountArray(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+ " "+ primeArray[i]);
		}
	}
	//this function returns the array containing count of 
	//prime factors for each of the elements in arr array
	public static int[] returnPrimeFactorCountArray(int[] arr){
		int[] result = new int[arr.length];
		for(int i=0; i<arr.length;i++){
			result[i]= getCountOfPrimeFactors(arr[i]);
		}
		return result;
	}
	public static int getCountOfPrimeFactors(int num){
		int count =0;
		while(num%2==0){
			count++; //counts number of 2s as factor
			num = num/2;
		}
		for(int i=3;i<Math.sqrt(num);i=i+2){
			while(num%i==0){
				count++; //counting all prime factors other than 2
				num = num/i;
			}
		}
		if(num>2) count++; //if its a prime number 
		return count;
	}
}
