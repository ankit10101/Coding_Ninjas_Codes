package stacks;

public class Stack {
	private int[] data;
	private int top;
	public Stack(){
		data = new int[5];
		top = -1;
	}
	public Stack(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	public int getSize() {
		return top + 1;
	}
	public boolean isFull() {
		return getSize() == data.length;
	}
	public boolean isEmpty() {
		return getSize() == 0;
	}
	public void push(int element) throws StackFullException {
		if(isFull()) {
			StackFullException ex = new StackFullException();
			throw ex;
		}
		top++;
		data[top] = element;
	}
	public int pop() throws StackEmptyException {
		if(isEmpty()){
			StackEmptyException ex = new StackEmptyException();
			throw ex;
		}
		int val = data[top];
		top--;
		return val;

	}
	public int peek() {
		if(isEmpty()){
			// Throw error TODO
			return Integer.MIN_VALUE;
		}
		return data[top];
	}

}
