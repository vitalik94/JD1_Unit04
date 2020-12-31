package by.htp.task01.main;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Sentence sentence = new Sentence();
		
		sentence.add(new Word("Изучение"));
		sentence.add(new Word("программирования"));
		sentence.add(new Word("на"));
		sentence.add(new Word("java"));
		
		Sentence title = new Sentence();
		
		title.add(new Word("Учеба"));
		
		Text textTitle = new Text();
		
		Text text = new Text();
		
		textTitle.add(title);
		text.add(sentence);
		
		
		print(textTitle);
		System.out.println();
		print(text);
		
	}
	
	public static void print(Text t) {
		
		for(Sentence s : t.getText()) {
			
			for(Word w : s.getSentence()) {
				
				System.out.print(w.getWord() + " ");
				
			}
			
		}
		
	}

}
