import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class FCFS implements Algorithm {
	private boolean[] bitVector;
	private ArrayList<Integer> queue;
	private int startPoint;
	private Queue<Integer> completeOrder;
	private ArrayList<Integer> steps;
	public FCFS(){		
	}
	private void processRequest(){
		completeOrder = new LinkedList<Integer>();
		for(int i = 0; i<queue.size();i++){
			completeOrder.offer(queue.get(i));
		}
	}
	@Override
	public Queue<Integer> getProcessedList(){
		return completeOrder;
		
	}
	@Override
	public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits, int start) {
		this.bitVector = bits;
		this.queue = queue;
		this.startPoint = start;
		processRequest();
		
	}
	@Override
	public ArrayList<Integer> getAlgorithmProcession() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
