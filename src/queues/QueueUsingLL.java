package queues;

public class QueueUsingLL<T> {
	private QueueLLNode<T> front;
	private QueueLLNode<T> rear;
	private static int size;
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		QueueLLNode<T> newNode = new QueueLLNode<T>(data);
		newNode.next = rear;
		rear = newNode;
		if(front == null) {
			front = rear;	
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T dequeue() throws QueueEmptyException {
		if(front == null) {
			QueueEmptyException ex = new QueueEmptyException();
			throw ex;
		}else {
			QueueLLNode<T> temp = rear;
			while(temp.next != front) {
				temp = temp.next;
			}
			if(front == rear) {
				front = null;
				rear = null;
			}else {
				front = temp;
			}
			size--;
			return temp.next.data;
		}
	}

	public T front() throws QueueEmptyException {
		if(front == null) {
			QueueEmptyException ex = new QueueEmptyException();
			throw ex;
		}else {
			return front.data;
		}
	}
}
