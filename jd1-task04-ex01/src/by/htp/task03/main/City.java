package by.htp.task03.main;

/*
 * 3.������� ������ ������ �����������, ��������� ������ �������, �����, �����. 
 * ������: ������� �� ������� �������, ���������� ��������, �������, ��������� ������. 
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
