package basicLogicQuestions;

import java.util.*;

public class ParanthesisProblem {
	public static void main(String args[]){
		String s = "(ABC{ABC[ABC]XYZ}XYZ)";
		boolean check = checkIfValidPara(s);
		if (check) System.out.println("yes");
		else System.out.println("no");
	}
	public static boolean checkIfValidPara(String s){
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char curr = s.charAt(i);
			if(map.keySet().contains(curr)){
				stack.push(curr);
			}
			else if (map.values().contains(curr)){
				if(!stack.empty() && map.get(stack.peek())==curr){
					stack.pop();
				}
				else return false;
			}
			
		}
		return stack.empty();
	}

}
