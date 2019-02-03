package linked_List_1;

public class LinkedListNode<T> {
	private T data;
	public LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
