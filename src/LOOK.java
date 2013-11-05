import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LOOK implements Algorithm {
	private boolean[] bitVector;
	private int startPoint;
	private ArrayList<Integer> queue;
	private Queue<Integer> processedOrder;
	@Override
	public Queue<Integer> getProcessedList() {
		return processedOrder;
	}
	private void processOrder(){
		processedOrder = new LinkedList<Integer>();
		int big = queue.get(queue.size()-1), small = queue.get(0);
		for(int i = startPoint; i<big;i++){
			if(bitVector[i]){
				processedOrder.offer(i);
				bitVector[i]=false;
				System.out.println(i + " has been added to order.");
			}
		}
		System.out.println("Right end reached. Reversing LOOK direction.");
		for(int i=big; i>small; i--){
			if(bitVector[i]){
				processedOrder.offer(i);
				bitVector[i]=false;
				System.out.println(i + " has been added to order.");
			}
		}
		System.out.println("Left end reached. Ending algorithm.");
	}
	@Override
	public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits,
			int start) {
		this.bitVector = bits;
		this.queue = queue;
		this.startPoint = start;
		processOrder();
	}
	
}
