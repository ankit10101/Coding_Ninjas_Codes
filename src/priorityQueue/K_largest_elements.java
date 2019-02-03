package priorityQueue;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class K_largest_elements {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for(;i < k;i++) {
			pq.add(input[i]);
		}
		for(;i < input.length;i++) {
			if(pq.peek() < input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> retVal = new ArrayList<>();
		while(!pq.isEmpty()) {
			retVal.add(pq.poll());
		}
		return retVal;
	}
}
