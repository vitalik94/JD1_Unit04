package by.htp.task03.main;

public class Main {
	
	public static void main(String[] args) {
		
		State s = new State("Беларусь", "Минск");
		
		s.add(new Region("Минская область", 30000));
		s.add(new Region("Гродненская область", 20000));
		s.add(new Region("Бретская область", 40000));
		s.add(new Region("Могилевская область", 20000));
		s.add(new Region("Гомельская область", 30000));
		s.add(new Region("Витебская область", 40000));
		
		StateLogic sl = new StateLogic();
		
		print(s,sl);
	
	}
	
	public static void print(State s, StateLogic sl) {
		
		for(Region r : s.getState()) {
				
				System.out.println(r.getNameRegion() + "," + r.getArea());
			
		}
		
		System.out.println("Количество областей: " + sl.numRegion(s));
		
		System.out.println("Площадь: " + sl.sumArea(s));
		
		System.out.println("Столица: " + s.getCapital());
		
	}

}
