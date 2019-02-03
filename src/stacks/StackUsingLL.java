package stacks;

public class StackUsingLL<T> {
	private StackLLNode<T> top;
	private static int size;
	public StackUsingLL() {
		top = null;
        size = 0;
	}	
	public int size() {
      return size;
	}
	
	public void push(T data) {
      StackLLNode<T> newNode = new StackLLNode<>(data);
      if(top == null) {
    	  top = newNode;
      }else {
    	  newNode.next = top;
    	  top = newNode;
      }
      size++;
	}
	
	public boolean isEmpty() {
       return size == 0;
	}
	
	public T pop() throws StackEmptyException {
         if(top == null) {
        	 StackEmptyException ex = new StackEmptyException();
        	 throw ex;
         }
         StackLLNode<T> temp = top;
         top = top.next;
         size--;
         return temp.data;
	}
	
	public T top() throws StackEmptyException {
		if(top == null) {
			StackEmptyException ex = new StackEmptyException();
			throw ex;
		}else
         return top.data;
	}
}
