package linkedLists;

	public class LinkedListNode {
		LinkedListNode next ;
		int data;
		
		public LinkedListNode(){
			next = null;
			data = 0;
			}
		public LinkedListNode(int d){
			next = null;
			data = d;
			}
		public LinkedListNode(int d,LinkedListNode node ){
			next = node;
			data = d;
			}
		public void setNext(LinkedListNode node ){
			next = node;
		}
		public void setData(int d ){
			data = d;
		}
		public LinkedListNode getNext(){
			return next;
		}
		public int getData(){
			return data;
		}
		
	}


