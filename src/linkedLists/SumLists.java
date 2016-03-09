package linkedLists;

public class SumLists {
	
	public static void main (String args[]){
		
		LinkedList list1 = new LinkedList();
		list1.append(7);
		list1.append(1);
		list1.append(6);
		
		LinkedList list2 = new LinkedList();
		list2.append(5);
		list2.append(9);
		list2.append(2);
		
		LinkedList sumList = sumtheTwoLists (list1, list2);
		sumList.printList();

	}
	
	 static LinkedList sumtheTwoLists (LinkedList list1, LinkedList list2){
		int num1 = returnListAsNumber (list1);
		int num2 = returnListAsNumber (list2);
		
		int sum = num1 + num2;

		LinkedList sumList = new LinkedList();
		int d;
		
		while (sum >0){			
			d = sum%10;
			sum = sum/10;
			sumList.append(d);
		}
		return sumList;
		
	}
	 static int returnListAsNumber (LinkedList list){
		int num = 0;
		int i=1;
		LinkedListNode node = list.head;
		while (node !=null){
			num = num + (node.data)*i;
			i = i*10;
			node = node.next;
		}
		return num;
	}
	

}
