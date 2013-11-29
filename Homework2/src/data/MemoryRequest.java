package data;
public class MemoryRequest {
	private int size;
	private int duration;
	private boolean finished;
	public MemoryRequest(int size, int duration) {
		this.finished = false;
		this.size = size;
		this.duration = duration;
	}
	public int getSize(){
		return this.size;
	}
	public int getDuration(){
		return this.duration;
	}
	public void tick(){
		duration--;
		if(duration<=0){
			finished = true;
		}
	}
	public boolean isFinished(){
		return finished;
	}

	public String toString(){
		return ("["+size+";"+duration+"]");
	}
}
