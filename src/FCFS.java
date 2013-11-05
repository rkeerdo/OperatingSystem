import java.util.ArrayList;


public class FCFS implements Algorithm {
	private boolean[] bitVector;
	private int[] queue;
	private int startPoint;
	private ArrayList<Integer> completeOrder;
	public FCFS(int[] queue, boolean[] bits, int start){
		completeOrder = new ArrayList<Integer>();
		this.queue = queue;
		this.bitVector = bits;
		this.startPoint = start;
		processRequest();
	}
	private void processRequest(){
		for(int i = 0; i<queue.length;i++){
			completeOrder.add(queue[i]);
		}
	}
	@Override
	public ArrayList<Integer> getProcessedList(){
		return completeOrder;
		
	}
}
