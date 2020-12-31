package by.htp.task02.main;

public class Engine {
	
	private String type;
	private int volume;
	
	public Engine(String type, int volume) {
		
		this.type = type;
		this.volume = volume;
		
	}
	
	public void setType(String type) {
		
		this.type = type;
		
	}
	
	public String getType() {
		
		return type;
		
	}
	
	public void setVolume(int volume) {
		
		this.volume = volume;
		
	}
	
	public int getVolume() {
		
		return volume;
		
	}
	
	@Override
	public String toString() {
		
		return "type" + type + "volume" + volume;
		
	}

}
