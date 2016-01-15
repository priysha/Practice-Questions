package arrayAndStrings;

public class OneAway {
	public static void main(String args[]){
		String input1 = "pale";
		String input2 = "bake";
		Boolean b = checkOneAway(input1,input2);
		if (b) System.out.println("yes");
		else System.out.println("no");
	}
	public static Boolean checkOneAway(String s1,String s2){
		if(s1.length() == s2.length()){
			return checkOneEditReplace(s1,s2);
		}
		else if (s1.length()-1 == s2.length()){
			return checkOneEditRemove (s2,s1);
		}
		else if (s2.length()-1 == s1.length()){
			return checkOneEditRemove (s1,s2);
		}
		else return false;
		
	}
	public static Boolean checkOneEditReplace(String s1, String s2){
		Boolean returnCount =false;
		for(int i=0;i<s1.length();i++){
			if (s1.charAt(i)!=s2.charAt(i)){
				if (returnCount){
					return false;
				}
				returnCount = true;
				}
		}
		return true;
	}
	
	public static Boolean checkOneEditRemove(String s1, String s2){
		Boolean returnCount =false;
		int index1=0;
		int index2=0;
		while (index1< s1.length() && index2 <s2.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}

}
