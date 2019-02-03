package queues;

public class QueueLLNode<T> {
		T data;
		QueueLLNode<T> next;

		public QueueLLNode(T data) {
			this.data = data;
		}
}
