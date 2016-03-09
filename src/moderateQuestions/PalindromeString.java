package moderateQuestions;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		String s= "abaaa";
    int low, high;
   HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int j=0;j<s.length();j++)
    {
    	//PUT ALL SINGLE CHARACTERS IN MAP
    	if(map.get(String.valueOf(s.charAt(j)))==null)
    		map.put(String.valueOf(s.charAt(j)), 1);
    }

    for (int i = 1; i < s.length(); ++i)
    {
       //GENERATE ALL EVEN LENGTH PALINDROMES AND PUT THOSE IN MAP
        low = i - 1;
        high = i;
        while (low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high))
        {
        	String even= s.substring(low, high+1);

        	if(map.get(even)==null)
        		map.put(even, 1);

            --low;
            high++;
            even=null;
        }


        low = i - 1;
        high = i + 1;
       //NOW GENERATE ALL ODD LENGTH PALINDROMES AND PUT IN MAP
        while (low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high))
        {
        	String odd= s.substring(low, high+1);
        	if(map.get(odd)==null)
        		map.put(odd, 1);

            --low;
            high++;
            odd=null;
        }
    }
    System.out.println("the number of distinct palindromes is: " + map.size());
   
}
}