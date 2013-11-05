import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class SSTF implements Algorithm {
	private boolean[] bitVector;
	private int startPoint;
	private ArrayList<Integer> queue;
	private Queue<Integer> processedOrder;
	private ArrayList<Integer> steps;
	public SSTF(){
		
	}
	
	@Override
	public Queue<Integer> getProcessedList() {
		return processedOrder;
	}

	private void processOrder(){
		boolean leftEnd = false, rightEnd = false;
		processedOrder = new LinkedList<Integer>();
		steps = new ArrayList<Integer>();
		ArrayList<Integer> processLeft = new ArrayList<Integer>();
		ArrayList<Integer> processRight = new ArrayList<Integer>();
		int n = startPoint, i=n+1, j=n-1;
		
		if(bitVector[n]){
			processedOrder.offer(n);
		}
		while(true){
			try{
			if(bitVector[i]){
				processedOrder.offer(i);
				bitVector[i]=false;
				j=i;
				System.out.println("Added to queue: " + i);
			}
			} catch (Exception e){
				System.out.println("Right end reached.");
				rightEnd = true;
			}
			try{
			if(bitVector[j]){
				processedOrder.offer(j);
				bitVector[j]=false;
				i=j;
				System.out.println("Added to queue: " + j);
			}
			} catch (Exception e){
				System.out.println("Left end reached.");
				leftEnd = true;
			}
			if(leftEnd && rightEnd){
				System.out.println("Order end.");
				break;
			}
			i++;
			j--;
		}
	}

	@Override
	public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits,
			int start) {
		this.queue = queue;
		this.bitVector = bits;
		this.startPoint = start;
		processOrder();
		
	}

	@Override
	public ArrayList<Integer> getAlgorithmProcession() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
