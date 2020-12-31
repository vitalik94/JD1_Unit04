package by.htp.task03.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task01.main.Sentence;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class Region {
	
	private String nameRegion;
	private int area;
	private List<City> region;
	
	public Region(String nameRegion, int area) {
		
		this.nameRegion = nameRegion;
		this.area = area;
		region = new ArrayList<City>();
		
	}
	
	public void setNameRegion(String nameRegion) {
		
		this.nameRegion = nameRegion;
		
	}
	
	public String getNameRegion() {
		
		return nameRegion;
		
	}
	
	public void setArea(int area) {
		
		this.area = area;
		
	}
	
	public int getArea() {
		
		return area;
		
	}
	
	public void setRegion(List<City> region) {
		
		this.region = region;
		
	}
	
	public List<City> getRegion() {
		
		return region;
		
	}
	
	public void add(City c) {
		
		region.add(c);
		
	}
	
	@Override
	public String toString() {
		
		return nameRegion + "," + area + "," + region;
		
	}

}
