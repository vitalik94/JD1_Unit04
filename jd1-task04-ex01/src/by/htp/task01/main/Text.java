package by.htp.task01.main;

/*
 * 1.Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста. 
 */

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private List<Sentence> text;
	private List<Sentence> title;
	
	public Text() {
		
		text = new ArrayList<Sentence>();
		title = new ArrayList<Sentence>();
		
	}
	
	public void setText(List<Sentence> text) {
		
		this.text = text;
		
	}
	
	public List<Sentence> getText(){
		
		return text;
		
	}
	
	public void setTitle(List<Sentence> title) {
		
		this.text = text;
		
	}
	
	public List<Sentence> getTitle(){
		
		return title;
		
	}
	
	public void add(Sentence s) {
		
		text.add(s);
		title.add(s);
		
	}
	
	@Override
	public String toString() {
		
		return "title" + title + "text" + text;
		
	}

}
