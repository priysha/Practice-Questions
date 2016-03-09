package linkedLists;

import java.util.HashSet;

public class DeletingNodes {
	
	Boolean deleteMiddleGivenNode (LinkedListNode n){
		if (n ==null || n.next ==null){
			return false;
		}
		LinkedListNode nextNode = n.next;
		n.data = nextNode.data;
		n.next = nextNode.next;
		return true;
	}
	public void removeDuplicatesUsingMaps(LinkedListNode n){
		HashSet <Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n.next != null){
			if(set.contains(n.data)){
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
				}
			n=n.next;
		}
		
	}
	public void removeDuplicatesUsingTwoPointers (LinkedListNode n){
		LinkedListNode p1 = n;
		
		while (p1.next !=null){
			LinkedListNode p2 = p1;
			while (p2.next !=null){
				if(p2.next.data == p1.data){
					p2.next = p2.next.next;					
				}
				else {
					p2 = p2.next;
				}
				
				}
			p1 = p1.next;
			}
			
		}
}
