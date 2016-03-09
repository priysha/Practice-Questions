package linkedLists;

public class LinkedList {

	LinkedListNode head;
	
	public LinkedList (){
		head = null;
	}
	public LinkedList (int d){
		head = new LinkedListNode(d);
	}
	public LinkedList (LinkedListNode node){
		head = node;
	}	
	public void append(int d){
		LinkedListNode end = getLastNode();
		if (end ==null){
			head = new LinkedListNode(d);
			}
		else {
			end.next = new LinkedListNode(d);
		}
		
	}
	
	LinkedListNode getLastNode(){
		if (head == null){
			return null;
		}
		LinkedListNode lastNode =  head;
		while (lastNode.next !=null){
			lastNode = lastNode.next;
		}
		return lastNode;
	}
	
	void deleteNode (int d){
		if (head == null){
			return;
		}
		LinkedListNode current = head;
		while (current !=null){
			if (current.next.data ==d){
				current.next = current.next.next;
			}
		}
		}
	void printList (){
		if (head == null){
			System.out.println("No values in list");
			}
		LinkedListNode node = head;
		while (node != null){
			System.out.print (node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	
	
	}

