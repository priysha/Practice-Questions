package arrayAndStrings;

public class ZeroMatrix {
	public static void main (String args[]){
		int[][] matrix = {{1,3,3},{0,2,0},{1,1,0}};
		setZeros(matrix);
		
	}
	public static void setZeros(int[][] m){
		boolean[] rows = new boolean[m.length];
		boolean[] columns = new boolean[m[0].length];
		int i,j;
		for(i=0;i<m.length;i++){
			for(j=0;j<m[0].length;j++){
				if (m[i][j]==0){
					rows[i]=true;
					columns[j]=true;
				}
			}
		}
		
		for(i=0;i<rows.length;i++){
			if (rows[i]) nullifyRows(m,i);
		}
		
		for(j=0;j<columns.length;j++){
			if (columns[j]) nullifyColumns(m,j);
		}	
		
		for (i=0;i<m.length;i++){
			for(j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] nullifyRows(int[][] m, int row){
		for(int j=0;j<m[0].length;j++){
			m[row][j]=0;
		}
		return m;
	}
	public static int[][] nullifyColumns(int[][] m, int col){
		for(int i=0;i<m.length;i++){
			m[i][col]=0;
		}
		return m;
	}
	

}
