import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class FCFS implements Algorithm {
	private boolean[] bitVector;
	private int[] queue;
	private int startPoint;
	private Queue<Integer> completeOrder;
	public FCFS(){		
	}
	private void processRequest(){
		completeOrder = new LinkedList<Integer>();
		for(int i = 0; i<queue.length;i++){
			completeOrder.offer(queue[i]);
		}
	}
	@Override
	public Queue<Integer> getProcessedList(){
		return completeOrder;
		
	}
	@Override
	public void setUpAlgorithm(int[] queue, boolean[] bits, int start) {
		this.bitVector = bits;
		this.queue = queue;
		this.startPoint = start;
		processRequest();
		
	}
	
}
