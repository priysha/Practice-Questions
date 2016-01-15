package arrayAndStrings;
import java.util.Arrays;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcddddd";
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
		int[] table = new int[2*(Character.getNumericValue('z')-Character.getNumericValue('a'))+1];
		int location;
		for(char c : ch){
			location = getCharLocation(c);
			table[location]++;
			}
		return table;
	}
	
	public static int getCharLocation(char ch){
		int val = Character.getNumericValue(ch);
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		
		if(val>=a && val<=z)
			return val-a;
		else 
			return val-A+a;
	}

}
