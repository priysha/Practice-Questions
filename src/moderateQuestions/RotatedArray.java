package moderateQuestions;

public class RotatedArray {
	public static void main(String args[]){
		int a[] = {4,5,6,7,0,1,2};
		int key =0;
		int loc = rotatedArrBinarySearch(a,key);
		if(loc ==-1)System.out.println("array doesnt have this key");
		System.out.println(loc);
		int locRec = rotatedArrBinarySearchRec(a,0,a.length,key);
		System.out.println(locRec);
	}
	public static int rotatedArrBinarySearch(int A[], int key){
		int L=0;
		int R= A.length-1;
		while(L<=R){
			int M = L+(R-L)/2;
			if(A[M]==key) return M;
			
			if(A[L]<=A[M]){
				if(A[L]<=key && key<A[M])
					R=M-1;
				else L=M+1;
			}
			else {
				if(A[M]<key && key<=A[R])
					L=M+1;
				else R=M-1;
			}
			
		}
		return -1;
	}
	public static int rotatedArrBinarySearchRec(int[] arr, int l, int r, int key){
		if(l>r) return -1;
		int m = l+(r-l)/2;
		if(key == arr[m]) return m;
		if(arr[l]<arr[m]){
			if(arr[l]<=key && key<arr[m])
				return rotatedArrBinarySearchRec(arr,l,m-1,key);
			else return rotatedArrBinarySearchRec(arr,m+1,r,key);
		}
		else{
			if(arr[m]<key && key<=arr[r])
				return rotatedArrBinarySearchRec(arr,m+1,r,key);
			else
				return rotatedArrBinarySearchRec(arr,l,m-1,key);
		}
	}
	

}
