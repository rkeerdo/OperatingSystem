package data;

import java.util.Queue;

import algorithms.AlgorithmSelector;

public class Worker extends Thread{
	private AlgorithmSelector selector;
	private Queue<MemoryRequest> requests;
	private int algorithm;
	private int memoryLen;
public Worker(AlgorithmSelector selector, Queue<MemoryRequest> requests, int algorithm, int memoryLen){
	this.selector = selector;
	this.requests = requests;
	this.algorithm = algorithm;
	this.memoryLen = memoryLen;
}
public void run(){
	selector.startAlgorithm(algorithm, requests, memoryLen);
}
}
