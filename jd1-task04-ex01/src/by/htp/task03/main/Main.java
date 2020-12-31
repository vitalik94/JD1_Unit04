package by.htp.task03.main;

public class Main {
	
	public static void main(String[] args) {
		
		State s = new State("��������", "�����");
		
		s.add(new Region("������� �������", 30000));
		s.add(new Region("����������� �������", 20000));
		s.add(new Region("�������� �������", 40000));
		s.add(new Region("����������� �������", 20000));
		s.add(new Region("���������� �������", 30000));
		s.add(new Region("��������� �������", 40000));
		
		StateLogic sl = new StateLogic();
		
		print(s,sl);
	
	}
	
	public static void print(State s, StateLogic sl) {
		
		for(Region r : s.getState()) {
				
				System.out.println(r.getNameRegion() + "," + r.getArea());
			
		}
		
		System.out.println("���������� ��������: " + sl.numRegion(s));
		
		System.out.println("�������: " + sl.sumArea(s));
		
		System.out.println("�������: " + s.getCapital());
		
	}

}
