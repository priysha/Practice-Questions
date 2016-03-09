package moderateQuestions;

public class Solution {
	public static void main(String[] args){
		String str = "Connections";
		String most = findMostFrequentChar(str);
		System.out.println(most);
	}
	static String findMostFrequentChar(String inputString) {
        char[] ch = inputString.toCharArray();
        int[] t = returnCharLocTable(ch);
        int max=0;
        int loc=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>max){
                max=t[i];
                loc = i;
            }
                
        }
        int a = (int)('a');
        
        String str= String.valueOf((char)(loc+(int)('a')));
        return str;
        }

static int[] returnCharLocTable(char[] ch){
    int[] table = new int[(Character.getNumericValue('z')-Character.getNumericValue('a')+1)];
    int location;
    for(char c : ch){
        location = getCharLocation(c);
        if(location >=0)
        table[location]++;
    }
    
    return table;
}
        
static int getCharLocation(char ch){
		int val = (int)(ch);
		int a = (int)('a'); 
		int z = (int)('z'); 
		int A = (int)('A'); 
		int Z = (int)('Z'); 
		if(val>=a && val<=z)
			return val-a;
		else if(val>=A && val<=Z)
			return ((val-A));
		else return -1;
	}


}
