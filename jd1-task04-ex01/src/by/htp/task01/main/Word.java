package by.htp.task01.main;

/*
 * 1.������� ������ ������ �����, ��������� ������ �����������, �����. 
 * ������: ��������� �����, ������� �� ������� �����, ��������� ������. 
 */

public class Word {
	
	private String word;
	
	public Word(String word) {
		
		this.word = word;
		
	}
	
	public void setWord(String word) {
		
		this.word = word;
		
	}
	
	public String getWord() {
		
		return word;
		
	}
	
	@Override
	public String toString() {
		
		return "word" + word;
		
	}

}
