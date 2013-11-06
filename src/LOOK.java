import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class LOOK implements Algorithm {
        private boolean[] bitVector;
        private int startPoint;
        private ArrayList<Integer> queue;
        private Queue<Integer> processedOrder;
        private ArrayList<Integer> steps;
        @Override
        public Queue<Integer> getProcessedList() {
                return processedOrder;
        }
        private void processOrder(){
                processedOrder = new LinkedList<Integer>();
                steps = new ArrayList<Integer>();
                ArrayList<Integer> sortList = new ArrayList<Integer>();
                sortList.addAll(queue);
                Collections.sort(sortList);
                int big = sortList.get(sortList.size()-1), small = sortList.get(0);
                for(int i = startPoint; i<big;i++){
                        if(bitVector[i]){
                                processedOrder.offer(i);
                                bitVector[i]=false;
                                System.out.println(i + " has been added to order.");
                        }
                        if(!(i==startPoint)&&!(i==big)){
                                steps.add(i);
                        }
                }
                System.out.println("Right end reached. Reversing LOOK direction.");
                for(int i=big; i>small; i--){
                        if(bitVector[i]){
                                processedOrder.offer(i);
                                bitVector[i]=false;
                                System.out.println(i + " has been added to order.");
                        }
                        steps.add(i);
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
        @Override
        public ArrayList<Integer> getAlgorithmProcession() {
                return steps;
        }
        
}