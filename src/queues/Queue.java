package queues;

public class Queue<T> {
	private T data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue(){
		data = (T[])(new Object[100]);
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public Queue(int capapcity) {
		data = (T[])(new Object[capapcity]);
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int getSize() {
	  	return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public boolean isFull() {
		return getSize() == data.length;
	}
	
	public void enQueue(T element) throws QueueFullException {
		if(isFull()) {
			QueueFullException ex = new QueueFullException();
			throw ex;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear + 1) % data.length;
		data[rear] = element;
		size++;
	}
	
	public T deQueue() throws QueueEmptyException {
		if(isEmpty()) {
			QueueEmptyException ex = new QueueEmptyException();
			throw ex;
		}
		T val = data[front];
		front = (front + 1) % data.length;
		size--;
		if(size == 0) {
			rear = -1;
			front = -1;
		}
		return val;
	}
	
	public T front() throws QueueEmptyException {
		if(isEmpty()) {
			QueueEmptyException ex = new QueueEmptyException();
			throw ex;
		}
		T val = data[front];
		return val;
	}
}
