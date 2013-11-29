package data;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

import algorithms.AlgorithmSelector;

public class DefaultDataStore {
	private int memoryLen;
	private String[] presets;
	private String custom;
	private Queue<MemoryRequest> currentRequests;
	private int currentAlgorithm;
	private String selectedInput;
	public DefaultDataStore() {
		currentRequests = new LinkedList<MemoryRequest>();
		memoryLen = 32;
		presets = new String[3];
		custom = new String();
		presets[0] = "[5,3];[5,2];[2,6];[4,6];[3,1]";
		presets[1] = "[4,1];[8,5];[1,9];[6,3];[2,7]";
		presets[2] = "[8,2];[5,3];[4,5];[3,7];[10,4]";
	}
	public void selectFirstPreset(){
	}
	public void selectSecondPreset(){
	}
	public void selectThirdPreset(){
	}
	public void setCustom(String newCustom){
		this.custom = newCustom;
	}
	public String getPreset(int index){
		return presets[index];
	}
	public String getCurrentCustom(){
		return custom;
	}
	public void setCurrentAlgorithm(int i){
		this.currentAlgorithm = i;
	}
	public void setSelectedInput(String text){
		this.selectedInput = text;
	}
	private Queue<MemoryRequest> parseRequestString(String requestForm){
		Queue<MemoryRequest> memoryQueue = new LinkedList<MemoryRequest>();
		String[] pieces1 = requestForm.split(";");
		for(String piece : pieces1){
			if(piece.startsWith("[") && piece.endsWith("]")){
				System.out.println(piece);
				piece = piece.replace("[", "");
				piece = piece.replace("]", "");
				System.out.println(piece);
				String[] pieces2 = piece.split(",");
				if(pieces2.length!=2){
					JOptionPane.showMessageDialog(null, "Invalid string entered! Cancel procedure.");
					return null;
				} else {
					try{
						MemoryRequest request = new MemoryRequest(Integer.parseInt(pieces2[0]), Integer.parseInt(pieces2[1]));	
						memoryQueue.add(request);
					} catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null,  "Please use correct formatting.");
						return null;
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid memory piece :" + piece);
			}
		}
		return memoryQueue;
	}
	public void pushAlgorithmStart(AlgorithmSelector selector){
		currentRequests = parseRequestString(selectedInput);
		if(currentRequests!=null){
			Worker worker = new Worker(selector, currentRequests, currentAlgorithm, memoryLen);
			worker.start();
			//selector.startAlgorithm(currentAlgorithm, currentRequests, memoryLen);
		}
	}
	
}
