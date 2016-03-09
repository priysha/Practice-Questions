package moderateQuestions;

public class IsItPossible {

	public static void main(String[] args){
		System.out.println(isitpossible(2,1,6,13));
	}
	static String isitpossible(int a, int b, int c, int d) {
		if(a>c || b>d){
			return "No";
		}
		else{
			if(a<=0 && b<=0){
				if(c>0 || d>0) return "No";
			}
			if(getGCD(Math.abs(a),Math.abs(b))== getGCD(Math.abs(c),Math.abs(d))) return "Yes";
			else return "No";

		}
	}
	static int getGCD(int a, int b){
		return b==0 ? a : getGCD(b, a%b); 

	}
}
