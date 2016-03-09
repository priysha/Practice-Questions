package basicLogicQuestions;

import java.lang.Math;


public class LongestCommonSubsequence {
	public static void main(String args[]){ //O(n^2)
		String x = "DCABCA";
		String y = "DADCAC";
		int[][] s = sizeLCS(x,y);
		System.out.println("size of LCS is: "+ s[x.length()][y.length()] );
		printLCS(x,y,s);
	}
	public static int[][] sizeLCS(String X, String Y){
		int m = X.length()+1; //7
		int n = Y.length()+1; //7
		int i,j;
		int[][] sizeLCS = new int[m][n];
		for(i=0;i<m;i++ ){
			sizeLCS[i][0]=0;
		}
		for(j=0;j<n;j++ ){
			sizeLCS[0][j]=0;
		}
		for (i=1;i<m;i++){
			for(j=1;j<n;j++){
				if(X.charAt(i-1) == Y.charAt(j-1)){
					sizeLCS[i][j] = sizeLCS[i-1][j-1]+1;
				}
				else {sizeLCS[i][j] = Math.max(sizeLCS[i][j-1],sizeLCS[i-1][j]);}
			}
		}
		return sizeLCS;
	}
	public static void printLCS(String x, String y, int[][] sizeLCS){
		int m = x.length();
		int n = y.length();
		int i=m;
		int j=n;
		StringBuilder lcs = new StringBuilder();
		while(i>0 && j>0){
			if(x.charAt(i-1)== y.charAt(j-1)) {
				lcs.append(x.charAt(i-1));
				i--;
				j--;
			}
			else if (sizeLCS[i-1][j] >= sizeLCS[i][j-1]) {
				i--;
			}
			else j--;
		}
		lcs.toString();
		lcs.reverse();
		System.out.println(lcs);
	}

}
