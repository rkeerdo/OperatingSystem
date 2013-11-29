package algorithms;

import graphics.AnimatorPane;
import java.util.Queue;
import data.MemoryRequest;

public interface Algorithm {
public void executeAlgorithm(AnimatorPane animatorPanel, Queue<MemoryRequest> requests, int memLen);
}
