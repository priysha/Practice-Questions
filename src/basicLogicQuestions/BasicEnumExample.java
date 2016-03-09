package basicLogicQuestions;

public class BasicEnumExample {
	public enum Company{
		EBAY(20),GOOGLE(30),YAHOO(40),MICROSOFT(10);
		private int value;
		private Company (int value){
			this.value = value;
		}
	}
	public static void main (String args[]){
		for (Company cname : Company.values()){
			System.out.println("Company name: "+ cname + " Company value: " + cname.value);
		}
	}

}
