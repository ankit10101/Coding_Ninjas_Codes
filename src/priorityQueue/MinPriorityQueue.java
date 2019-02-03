package priorityQueue;
import java.util.ArrayList;

class PriorityQueueException extends Exception{

}

public class MinPriorityQueue {
	private ArrayList<Integer> heap;

	public MinPriorityQueue() {
		heap = new ArrayList<>();
	}

	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while(childIndex > 0) {
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			else
			{
				break;
			}
		}
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

	public int getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();  // Anonymous Objects
		}
		return heap.get(0);
	}
	
	public int getSize() {
		return heap.size();
	}

	public int removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		int retVal = heap.get(0);
		heap.set(0,heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		if(heap.size() > 1) {
			downHeapify(0);
		}
		return retVal;
	}

	private void downHeapify(int i) {
		int leftChildIndex = 2 * i + 1;
		int rightChildIndex = 2 * i + 2;
		if(leftChildIndex >= heap.size()) {
			return;
		}
		int minIndex = i;
		if(heap.get(leftChildIndex) < heap.get(minIndex)) {
			minIndex = leftChildIndex;
		}
		if(rightChildIndex < heap.size()  && heap.get(rightChildIndex) < heap.get(minIndex) ) {
			minIndex = rightChildIndex;
		}
		if(minIndex != i) {
			int temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(i));
			heap.set(i,temp);
			downHeapify(minIndex);
		}
	}
}
