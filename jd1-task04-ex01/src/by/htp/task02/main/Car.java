package by.htp.task02.main;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться,менять колесо, вывести на консоль марку автомобиля. 
 */

public class Car {

	private String model;
	private Wheel wheel;
	private Engine engine;
	private Capacity capacity;

	public Car(String model, Wheel wheel, Engine engine, Capacity capacity) {

		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
		this.capacity = capacity;

	}

	public void setModel(String model) {

		this.model = model;

	}

	public String getModel() {

		return model;

	}

	public void setWheel(Wheel wheel) {

		this.wheel = wheel;

	}

	public Wheel getWheel() {

		return wheel;

	}

	public void setEngine(Engine engine) {

		this.engine = engine;

	}

	public Engine getEngine() {

		return engine;

	}

	public void setCapacity(Capacity capacity) {

		this.capacity = capacity;

	}

	public Capacity getCapacity() {

		return capacity;

	}

	@Override
	public String toString() {

		return "model" + model + "wheel" + wheel + "engine" + engine + "capacity" + capacity;

	}

}
