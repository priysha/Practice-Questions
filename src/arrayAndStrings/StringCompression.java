package arrayAndStrings;
import java.util.Arrays;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="AbAAaaacdddddff";
		String newString = compressTheString(s);
		System.out.println(newString);
	}
	public static String compressTheString(String s){
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int i;
		int[] table = getCharacterFrequency(ch);
		
		StringBuilder compressedString = new StringBuilder();
		int location;
		i=0;
		while (i<ch.length){
			compressedString.append(ch[i]);
			location = getCharLocation(ch[i]);
			compressedString.append(table[location]);
			i= i+ table[location];
			}
		return compressedString.length() > s.length() ? s : compressedString.toString();
	}
	public static int[] getCharacterFrequency(char[] ch){
		int[] table = new int[2*(Character.getNumericValue('z')-Character.getNumericValue('a')+1)];
		int location;
		for(char c : ch){
			//System.out.print( c+ " ");
			location = getCharLocation(c);
			//System.out.print(location +" ");
			table[location]++;
			}
		return table;
	}
	
	public static int getCharLocation(char ch){
		int val = (int)(ch);
		int a = (int)('a'); //97
		int z = (int)('z'); //122
		int A = (int)('A'); //65
		int Z = (int)('Z'); //90
		if(val>=a && val<=z)
			return val-a;
		else 
			return ((val-A));
	}

}
