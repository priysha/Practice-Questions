package basicLogicQuestions;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main (String args[]){
		int num;
		System.out.println("Enter the number :");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (checkForPalindrome(num)) System.out.println("yes a palindrome");
		else System.out.println("No, not a palindrome");
	}
	public static Boolean checkForPalindrome(int n){
		int number =n,d,newNum=0;
		
		while (number >0){
			d = number%10;
			number = number/10;
			newNum =newNum*10 + d;
						
		}
		if (newNum == n) return true;
		else return false;
	}

}
