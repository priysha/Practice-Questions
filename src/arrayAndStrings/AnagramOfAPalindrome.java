package arrayAndStrings;

public class AnagramOfAPalindrome {
	public static void main (String Args[]){
		String s = "Rats live on no evil star";
		int[] table = getCharFrequencyTable(s);
		Boolean b = checkForOddCount(table);
		if (b) System.out.println("Yes an anagram of a palindrome");
		else System.out.println("No, not an anagram of a palindrome");
	}
	
	public static Boolean checkForOddCount(int[] table){
		int oddCount=0;
		for (int alpha : table){
			if (oddCount>1)
				return false;
			else if(alpha%2 !=0)
				oddCount++;
			}
		return true;
		
	}
	public static int[] getCharFrequencyTable(String input){
		int[] table = new int[Character.getNumericValue('z')- Character.getNumericValue('a')+1 ];
		int location;
		for(char c : input.toCharArray()){
			location = getCharLocation(c);
			if(location !=-1)
			table[location]++;
		}
		
		return table;
	}
	public static int getCharLocation(char ch){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		int val=Character.getNumericValue(ch);
		if(val>= a && val <=z){
			return (val - a);
		}
		else if (val>= A && val <=Z){
			return (val - A);
		}
		else return -1;
		}
	}

