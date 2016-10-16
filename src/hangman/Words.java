package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Words {
	
	private List<String> words;
	
	public Words() {
		makeWords();
	}
	
	private void makeWords() {
		words = new ArrayList<String>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("words.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scanner.hasNextLine()) {
			words.add(scanner.nextLine());
		}
	}
	
	public String getWord() {
		if(words.size() == 0) {
			makeWords();
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(words.size());
		String word = words.get(randomIndex);
		words.remove(randomIndex);
		
		return word;
	}
	
	public boolean hasWords() {
		return words.size() > 0;
	}
}
