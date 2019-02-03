package trees;

public class Queue_generic<T> {
	private T data[];
	private int front;
	private int rear;
	private int size;

	public Queue_generic() {
		data = (T[])(new Object[100]);
		front = -1;
		rear = -1;
		size = 0;
	}

	public Queue_generic(int capapcity) {
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

	public void enQueue(T element) {
		if(isFull()) {
			// Throw Error - TODO
			return;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear + 1) % data.length;
		data[rear] = element;
		size++;
	}

	public T deQueue() {
		if(isEmpty()) {
			// Throw Error - TODO
			return null;
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

	public T front() {
		if(isEmpty()) {
			// Throw Error - TODO
			return null;
		}
		T val = data[front];
		return val;
	}
}
