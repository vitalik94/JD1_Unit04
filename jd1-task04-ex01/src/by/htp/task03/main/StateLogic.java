package by.htp.task03.main;

import java.util.List;

public class StateLogic {
	
	public int numRegion(State s) {
		
		int num = 0;
		
		List<Region> state = s.getState();
		
		for(Region r : state) {
			
			num++;
			
		}
		
		return num;
		
	}
	
	public int sumArea(State s) {
		
		int sum = 0;
		
		List<Region> state = s.getState();
		
		for(Region r : state) {
			
			sum += r.getArea();
			
		}
		
		return sum;
		
	}
	

}
