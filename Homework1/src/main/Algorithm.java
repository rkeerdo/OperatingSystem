package main;
import java.util.ArrayList;
import java.util.Queue;




public interface Algorithm {
	/**Returns a processed list in correct order.*/
 public Queue<Integer> getProcessedList();
 	/**Sets up and processes the given algorithm so the results can be retrieved.*/
 public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits, int start);
 	/**Returns the list of indexes on how the algorithm processed over the given order.*/
 public ArrayList<Integer> getAlgorithmProcession();
}
