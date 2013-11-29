package algorithms;

import java.util.Queue;

import data.MemoryRequest;

import graphics.AnimatorPane;

public class AlgorithmSelector {
	private AnimatorPane pane;

	public AlgorithmSelector(AnimatorPane pane) {
		this.pane = pane;
	}

	public void startAlgorithm(int index, Queue<MemoryRequest> requests, int memLen) {
		Algorithm algorithm;
		switch(index){
		case 0:
			System.out.println("FirstFit");
			algorithm = new FirstFit();
			algorithm.executeAlgorithm(pane, requests, memLen);
			break;
		case 1:
			System.out.println("BestFit");
			algorithm = new BestFit();
			algorithm.executeAlgorithm(pane, requests, memLen);
			break;
		case 2:
			System.out.println("WorstFit");
			algorithm = new WorstFit();
			algorithm.executeAlgorithm(pane, requests, memLen);
			break;
		case 3:
			System.out.println("RandomFit");
			algorithm = new RandomFit();
			algorithm.executeAlgorithm(pane, requests, memLen);
			break;
		}
	}
}
