package main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class NOOP implements Algorithm {
	private boolean[] bitVector;
	private ArrayList<Integer> queue;
	private int startPoint;
	private Queue<Integer> completeOrder;
	private ArrayList<Integer> steps;
	public NOOP(){		
	}
	private void processRequest(){
		steps = new ArrayList<Integer>();
		completeOrder = new LinkedList<Integer>();
		for(int i = 0; i<queue.size();i++){
			completeOrder.offer(queue.get(i));
		}
		if(startPoint>queue.get(0)){
			for(int i=startPoint;i>queue.get(0);i--){
				steps.add(i);
			}
		} else {
			for(int i=startPoint; i<queue.get(0); i++){
			steps.add(i);
			}
		}
		for(int i = 0; i<queue.size()-1;i++){
			int elem1 = queue.get(i);
			int elem2 = queue.get(i+1);
			if(elem1>elem2){
				for(int j = elem1; j>elem2; j--){
					steps.add(j);
				}
			} else {
				for(int j= elem1; j<elem2;j++){
					steps.add(j);
				}
			}
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
		return steps;
	}
	
}