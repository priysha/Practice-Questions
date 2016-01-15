package arrayAndStrings;

public class PalindromeString {
	
	public static void main(String args[]){
		
		String s = "abcddcba";
		int n=1;
		Boolean b;
		if (n==0){
			b = checkPalindromUsingLib(s);
			
		}
		else{
			char[] charArray = s.toCharArray();
			b = checkPalindromWithoutUsingLib(charArray);
		}
		if (b) System.out.println("Yes, a palindrome");
		else System.out.println("No,not a palindrome");
	}
	public static Boolean checkPalindromUsingLib(String s){
		
		return s.equals(new StringBuffer(s).reverse().toString());
	}	
	public static Boolean checkPalindromWithoutUsingLib(char[] c){
		int check=0;
		if (c.length % 2 ==0 ){
			for(int i=0;i<c.length/2-1;i++){
				if(c[i]!= c[c.length-i-1]){
					return false;
					}
			}
		
		}
		else {
			for(int i=0;i<(c.length-1)/2-1;i++){
				if(c[i]!= c[c.length-i-1]){
					return false;
					}
			}
		}
		
		return true;
		
	}

}
