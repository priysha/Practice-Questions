package moderateQuestions;

public class LoveLetterMystery {
	public static void main(String[] args) {
		String[] letter = {"abc","abcba","abcd"};
		String s;
		for(int i=0;i<letter.length;i++){
			s = letter[i];
			int len = s.length();
			int j = 0;
			int k = len - 1;
			int count = 0;
			while(j < k)
			{
				int s1 = s.charAt(j) - 97;
				int s2 = s.charAt(k) - 97;
				if(s1 < s2)
				{
					s2 = s2 - s1;
					count = count + s2;
				}
				else if(s1 > s2)
				{
					s1 = s1 - s2;
					count = count + s1;
				}
				//System.out.println(j + " " + k);
				k--;
				j++;
			}
			System.out.println(count);

		}
	}

}
