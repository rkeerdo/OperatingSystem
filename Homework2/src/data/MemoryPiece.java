package data;

public class MemoryPiece {
	private int len;
	private int startingPoint;
	//If type == true, it is a piece of empty memory that can be used.
	private boolean type;
	private MemoryRequest currentService;
	public MemoryPiece(boolean isHole, int length, int startPoint) {
		this.len = length;
		this.startingPoint = startPoint;
		this.type = isHole;
	}

	public MemoryRequest getCurrentRequest(){
		return currentService;
	}
	public int getLength(){
		return this.len;
	}
	public int getStartPoint(){
		return startingPoint;
	}
	public boolean isHole(){
		return type;
	}
	
	public void setLength(int len){
		this.len = len;
	}
	public void setStartPoint(int startPoint){
		this.startingPoint = startPoint;
	}
	/**Joins two empty memory pieces and returns a single new piece.*/
	public MemoryPiece joinHoles(MemoryPiece otherMemory){
		int otherLen = otherMemory.getLength();
		int otherStart = otherMemory.getStartPoint();
		int newStart;
		if(otherStart<this.startingPoint){
			newStart=otherStart;
		} else {
			newStart=startingPoint;
		} 
		MemoryPiece returnPiece = new MemoryPiece(true, this.len+otherLen, newStart);
		return returnPiece;
	}
	public boolean canProcessRequest(MemoryRequest request){
		if(type){
			if(request==null){
				return true;
			}
		 	if(request.getSize()<=len){
		 		return true;
		 	} else {
		 		return false;
		 	}
		} else {
			return false;
		}
	}
	/**Starts a new process, turning the current object into a working process and */
	public MemoryPiece startProcess(MemoryRequest request){
		this.currentService = request;
		this.type = false;
		int newStart = this.startingPoint + request.getSize();
		int newSize = this.len-request.getSize();
		this.len = request.getSize();
		return new MemoryPiece(true, newSize, newStart);
	}
	public void processCurrentRequest(){
		if(type){
			return;
		} else {
			currentService.tick();
			if(currentService.isFinished()){
				setBackToEmpty();
			}
		}
	}
	
	private void setBackToEmpty(){
		this.currentService = null;
		this.type = true;
	}	
}
