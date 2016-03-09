package moderateQuestions;

public class NumberSwapper {
	public static void main(String args[]){
		int a=5;
		int b=3;
		System.out.println("Bit swap");
		swapWithBit(a,b);
		System.out.println("In place swap");
		swapInPlace(a,b);
	}
	public static void swapWithBit(int a, int b){
		System.out.println("Before : a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After : a="+a+" b="+b);
	}
	public static void swapInPlace(int a, int b){
		System.out.println("Before : a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After : a="+a+" b="+b);
	}
}
