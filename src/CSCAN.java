import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CSCAN implements Algorithm {
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
		for(int i = startPoint; i<bitVector.length; i++){
			if(bitVector[i]){
				processedOrder.offer(i);
				bitVector[i]=false;
				System.out.println(i + " has been added to order.");
			}
		}
		System.out.println("Right end reached. Moving reader head to beginning.");
		for(int i=0; i<startPoint; i++){
			if(bitVector[i]){
				processedOrder.offer(i);
				bitVector[i]=false;
				System.out.println(i + " has been added to order.");
			}
		}
		System.out.println("Start point reached. Ending algorithm.");
	}
	@Override
	public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits,
			int start) {
		this.queue = queue;
		this.bitVector = bits;
		this.startPoint = start;
		processOrder();
	}
	

}
