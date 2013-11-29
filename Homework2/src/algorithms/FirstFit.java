package algorithms;

import graphics.AnimatorPane;

import java.util.ArrayList;
import java.util.Queue;

import data.MemoryPiece;
import data.MemoryRequest;

public class FirstFit implements Algorithm {
	ArrayList<MemoryPiece> memory;
	MemoryRequest nextService;
	AnimatorPane pane;
	Queue<MemoryRequest> requests;

	public FirstFit() {
		memory = new ArrayList<MemoryPiece>();
	}

	@Override
	public void executeAlgorithm(AnimatorPane animatorPanel,
			Queue<MemoryRequest> requests, int memLen) {
		pane = animatorPanel;
		MemoryPiece firstPiece = new MemoryPiece(true, memLen, 0);
		memory.add(firstPiece);
		this.requests = requests;
		nextService = this.requests.poll();
		serviceRequest();
		while (!((memory.get(0).isHole()) && (memory.get(0).getLength() == memLen))) {
			serviceRequest();
		}
	}

	private void serviceRequest() {
		if (checkForAdjecentHoles())
			joinHoles();
		int aval = getFirstAvalible();
		if (aval < 0) {
			pane.debug("Unavalible space. Waiting for new avalible memory space.");
		} else if(nextService!=null){
			MemoryPiece nextHole = memory.get(aval).startProcess(nextService);
			memory.add(aval + 1, nextHole);
		}
		for (int i = 0; i < memory.size(); i++) {
			if (!memory.get(i).isHole()) {
				System.out.println("Processing request:"
						+ memory.get(i).getCurrentRequest());
				pane.debug("Processing request:"
						+ memory.get(i).getCurrentRequest());
				memory.get(i).processCurrentRequest();
				pane.repaint();
			}
		}
		if(canFitNext()){
			nextService = this.requests.poll();
		}
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			pane.debug("An error has occurred. System may not act normal anymore.");
		}

	}

	private void joinHoles() {
		boolean adjecentHolesPresent = checkForAdjecentHoles();
		while (adjecentHolesPresent) {
			for (int i = 0; i < (memory.size() - 1); i++) {
				MemoryPiece p1 = memory.get(i);
				MemoryPiece p2 = memory.get(i + 1);
				if (p1.isHole() && p2.isHole()) {
					memory.remove(i + 1);
					memory.set(i, p1.joinHoles(p2));
				}
			}
			adjecentHolesPresent = checkForAdjecentHoles();
		}
	}

	private boolean checkForAdjecentHoles() {
		for (int i = 0; i < (memory.size() - 1); i++) {
			MemoryPiece piece1 = memory.get(i);
			MemoryPiece piece2 = memory.get(i + 1);
			if (piece1.isHole() && piece2.isHole()) {
				return true;
			}
		}
		return false;
	}

	private int getFirstAvalible() {
		for (int i = 0; i < memory.size(); i++) {
			if (memory.get(i).canProcessRequest(nextService)) {
				return i;
			}
		}
		return -1;
	}

	private boolean canFitNext() {
		if (getFirstAvalible() >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
