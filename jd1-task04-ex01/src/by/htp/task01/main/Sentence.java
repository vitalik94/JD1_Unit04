package by.htp.task01.main;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<Word> sentence;
	
	public Sentence() {
		
		sentence = new ArrayList<Word>();
		
	}
	
	public void setSentence(List<Word> sentence) {
		
		this.sentence = sentence;
		
	}
	
	public List<Word> getSentence(){
		
		return sentence;
		
	}
	
	public void add(Word w) {
		
		sentence.add(w);
		
	}
	
	@Override
	public String toString() {
		
		return "sentence" + sentence;
		
	}

}
