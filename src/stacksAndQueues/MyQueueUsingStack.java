package stacksAndQueues;

import java.util.Stack;

public class MyQueueUsingStack<T> {
	Stack<T> stackNewest, stackOldest;
	public MyQueueUsingStack(){
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	public void add (T item){
		stackNewest.push(item);
	}
	public void shiftStacks(){
		if (stackOldest.isEmpty()){
			while (!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	public T peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	public T remove(){
		shiftStacks();
		return stackOldest.pop();
	}

}
