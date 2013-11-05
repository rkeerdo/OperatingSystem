import java.util.ArrayList;
import java.util.Queue;


public interface Algorithm {
	/**Returns a processed list in correct order.*/
 public Queue<Integer> getProcessedList();
 	/**Sets up and processes the given algorithm so the results can be retrieved.*/
 public void setUpAlgorithm(ArrayList<Integer> queue, boolean[] bits, int start);
}
