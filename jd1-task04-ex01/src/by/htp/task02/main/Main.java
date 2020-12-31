package by.htp.task02.main;

public class Main {
	
	public static void main(String[] args) {
		
		Car c = new Car("Rolls Rouse",new Wheel(15, false), new Engine("бензиновый", 2), new Capacity(30));
		
		print(c);
		
	}
	
	public static void print(Car c) {
		
		System.out.println(c.getModel());
		
	}

}
