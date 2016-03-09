package basicLogicQuestions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner n = new Scanner(System.in);
        int t = n.nextInt();
        for(int i=0;i<t;i++){
        	n.nextLine();
            String s = n.nextLine();
            checkFunnyString(s);
        }
    }
    public static void checkFunnyString(String s){
       
        String r = new StringBuffer(s).reverse().toString();
        int n = s.length();
        for(int i=0;i<n/2;i++){
            int x = Math.abs((int)(s.charAt(i))-(int)(s.charAt(i+1)));
        	int y = Math.abs((int)(r.charAt(i))-(int)(r.charAt(i+1)));
            if(x != y){
                System.out.println("Not Funny");
                return;
            }
        }
        System.out.println("Funny");
    }
}  