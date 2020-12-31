package by.htp.task03.main;

import java.util.ArrayList;
import java.util.List;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class State {
	
	private String nameState;
	private String capital;
	private List<Region> state;
	
	public State(String nameState, String capital) {
		
		this.nameState = nameState;
		this.capital = capital;
		state = new ArrayList<Region>();
		
	}
	
	public void setNameState(String nameState) {
		
		this.nameState = nameState;
		
	}
	
	public String getNameState() {
		
		return nameState;
		
	}
	
	public void setCapital(String Capital) {
		
		this.capital = capital;
		
	}
	
	public String getCapital() {
		
		return capital;
		
	}
	
	public void setState(List<Region> state) {
		
		this.state = state;
		
	}
	
	public List<Region> getState() {
		
		return state;
		
	}
	
	public void add(Region r) {
		
		state.add(r);
		
	}
	
	@Override
	public String toString() {
		
		return "nameState" + nameState + "capital" + capital + "state" + state;
		
	}

}
