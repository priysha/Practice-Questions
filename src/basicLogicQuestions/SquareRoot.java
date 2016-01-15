package basicLogicQuestions;
import java.util.Scanner;

public class SquareRoot {
	
	public static void main (String args[]){
		int num;
		System.out.println("enter the number : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		double sqrt = getSquareRootOfNumber(num);
		System.out.println("sqrt of " + num + " is " + sqrt );
		
	}
	public static double getSquareRootOfNumber(int n){
		double lb=1.0;
		double ub = n;
		if (n <= 0 ) return 0.0;
		else if (n== 1) return 1.0;
		double root = lb + (ub - lb)/2;
		while(root > n/root || (root+1)<=(n/(root+1))){
			if(root > n/root) ub= root;
			else lb = root;
			root = lb +(ub-lb)/2;
			
		}
		return root;
	}

}
