package linkedLists;

public class LinkedListActions1 {
	
	LinkedListNode partitionLinkedList (LinkedListNode node, int x){
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while (node != null){
			LinkedListNode next = node.next;
			if (node.data <x){
				node.next = head;
				head = node;
			}
			else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
			tail.next = null;
			return head;
			
	}
	
	LinkedListNode loopDetection (LinkedListNode head){
		
		if (head == null || head.next == null){
			return null;
		}
		
		LinkedListNode current = head;
		LinkedListNode runner = head.next;
		
		while (current !=runner || runner.next !=null ){
			current = current.next;
			runner = runner.next.next;
		}
		return current;
	}
	LinkedListNode returnKthLastUsingTwoPointers (LinkedListNode head, int k){
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for(int i= 0; i<k ; i++){
			if (p1 == null) return null;
			p1 = p1.next;
			
		}
		while (p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
			
		}
		return p2;
		
	}
	
	int printKthLastUsingRecursion (LinkedListNode head, int k){
		if (head == null){
			return 0;
		}
		int index = printKthLastUsingRecursion(head.next, k) +1;
		if (index == k){
			System.out.println(k + "th from last element is "+ head.data);
		}
		return index;
	}

}
