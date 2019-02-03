package priorityQueue;

public class MinPriorityQueueUse {

	public static void main(String[] args) {
		int[] arr = {2,1,70,100,20,10};
		MinPriorityQueue pq = new MinPriorityQueue();
		for(int val: arr) {
			pq.insert(val);
		}
		try {
	        while(!pq.isEmpty()) {		
			System.out.println(pq.removeMin());
	        }
		}catch(PriorityQueueException ex){
			ex.printStackTrace();
		}
	}
}
