package by.htp.task03.main;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class City {
	
	private String nameCity;
	
	public City(String nameCity) {
		
		this.nameCity = nameCity;
		
	}
	
	public void setNameCity(String nameCity) {
		
		this.nameCity = nameCity;
		
	}
	
	public String getNameCity() {
		
		return nameCity;
		
	}
	
	@Override
	public String toString() {
		
		return "nameCity" + nameCity;
		
	}

}
