package by.htp.task05.main;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору 
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
 * для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */

public class TouristPackages {

	private Type type;
	private Transport transport;
	private Food food;
	private int day;

	public TouristPackages(Type type, Transport transport, Food food, int day) {

		this.type = type;
		this.transport = transport;
		this.food = food;
		this.day = day;

	}

	public void setType(Type type) {

		this.type = type;

	}

	public void setTransport(Transport transport) {

		this.transport = transport;

	}

	public void setFood(Food food) {

		this.food = food;

	}

	public void setDay(int day) {

		this.day = day;

	}

	public Type getType() {

		return type;

	}

	public Transport getTransport() {

		return transport;

	}

	public Food getFood() {

		return food;

	}

	public int getDay() {

		return day;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristPackages other = (TouristPackages) obj;
		if (day != other.day)
			return false;
		if (food != other.food)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TouristPackages [type=" + type + ", transport=" + transport + ", food=" + food + ", day=" + day + "]";
	}

}
